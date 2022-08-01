package Data_Driven;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class GET {
	@Test
	public void Getemp() throws InterruptedException {
		 baseURI = "http://localhost:3000";
	       
	     String response =given().header("Content-Type","application/json")
		          .when().get("/users")
		          .then().log().all().log().all().assertThat().statusCode(200).extract().response().asString();
		          JsonPath js=new JsonPath(response);
		  
			String value=js.getString("[0].first_name");
			System.out.println(value);
//			List<Object> array_data= js.getList("first_name");
//			System.out.println(array_data);
//			
//			List<String> data=js.getList("findAll{it.first_name=='Robert'}.id");
//			System.out.println(data);
//			
//			
		

}

}
