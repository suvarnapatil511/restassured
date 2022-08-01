package Data_Driven;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POST{

	
	


	
	@Test(dataProvider = "EMPdataprovider")
	public void test(int ID,String fname,String lname,String EMAIL) throws IOException {
	
	baseURI="http://localhost:3000";
JSONObject request=new JSONObject();
request.put("id",ID);
request.put("first_name",fname);
request.put("last_name",lname);
request.put("email",EMAIL);
  
System.out.println(request);
System.out.println(request.toJSONString());

  Response response= given().header("Content-Type","application/json").contentType(ContentType.JSON)
		.body(request.toJSONString())
		   .when().post("/users")
		.then().log().all().assertThat().statusCode(201).extract().response();
     System.out.println(response);
 


	
	}
	
//	@DataProvider(name="EMPdataprovider")
//	String[][] getEMPdata() throws IOException{
	
	
//	    String path=System.getProperty("user.dir")+".//src//test//resources//Employee.xlsx";
//	   int rowCount=XLUtils.getCountRow(path,"Sheet1");
//	   System.out.println("Rowcount is"+rowCount);
//	  int colCount=XLUtils.getCountCell(path, "Sheet1",0);
//	  System.out.println("Colcount is"+colCount);
//	  String[][] empdata=new String[rowCount][colCount];
//	  for(int  i=1;i<rowCount;i++) {
//	 
//
//		  String fname=XLUtils.getCelldata((path,"Sheet1", 0, 0),(path,"Sheet1",i,0));
//		  String lname=XLUtils.getCelldata((path,"Sheet1",0, 1),(path,"Sheet1",i,1));
//		  String email=XLUtils.getCelldata((path,"Sheet1",0, 2),(path,"Sheet1",i,1));
//    System.out.println("row "+row+" data are");
//    System.out.println(" fname"  +fname);
//    System.out.println(" lname"  +lname);
//    System.out.println(" email"  +email);
//
//		  }
//	return (empdata);
//	
//	
	  }
	  /////////////*********************DataProvidercode***************////////
         //	@DataProvider(name="EMPdataprovider")
	      //Object [][]Empdata(){

		//Object[][] empdata= {{19,"robby","merchant","robby12@yahoo.com"},{20,"roy","diru","amy13@yahoo.com"}};
	     //return (empdata);
	     // }
	
		
	  
	