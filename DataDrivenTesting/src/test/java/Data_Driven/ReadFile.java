package Data_Driven;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ReadFile {
	@SuppressWarnings("unchecked")
	@Test() //TestNG annotation
    void postNewEmployees() throws IOException {
        RestAssured.baseURI = "http://localhost:3000";
        
        //Here we created data through json object that we can send along with POST request
        JSONObject request = new JSONObject();
//        request.put(XLUtils.getData(0, 0, 0), XLUtils.getData(0, 1, 0));
//        request.put(XLUtils.getData(0, 0, 1), XLUtils.getData(0, 1, 1));
//        request.put(XLUtils.getData(0, 0, 2), XLUtils.getData(0, 1, 2));
        int rowCount=XLUtils.getCountRow("Sheet1");
        for(int i=1;i<=rowCount;i++) {
        request.put(XLUtils.getCelldata("Sheet1", 0, 0),XLUtils.getCelldata("Sheet1",i,0));
        request.put( XLUtils.getCelldata("Sheet1",0, 1),XLUtils.getCelldata("Sheet1",i,1));
        request.put(XLUtils.getCelldata("Sheet1",0, 2),XLUtils.getCelldata("Sheet1",i,2));
       
        

        //capturing response body to perform validations
        
        System.out.println(request);
        System.out.println(request.toJSONString());

          Response response= given().header("Content-Type","application/json").contentType(ContentType.JSON)
        		.body(request.toJSONString())
        		   .when().post("/users")
        		.then().log().all().assertThat().statusCode(201).extract().response();
             System.out.println(response);
             //capturing response body to perform validations
             String responseBody = response.getBody().asString();
        int status = response.getStatusCode();
        System.out.println(status);
       // Assert.assertEquals(status, 200);
       
    
}

}}
