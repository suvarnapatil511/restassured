package StepDefination;

import com.google.gson.JsonObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class POST {
	String BASE_URL="http://localhost:3000";
	RequestSpecification httpRequest=RestAssured.given();
	Response response;
	@Given("^To execute POST method$")
	public void to_execute_POST_method() throws Throwable {
		RestAssured.baseURI=BASE_URL;
		JSONObject object=new JSONObject();
		object.put("id",37);
		object.put("fname", "yahoo");
		object.put("lname","google");
		object.put("email", "yahoogoogle@yahoo.com");
		
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^send a post http request$")
	public void send_a_post_http_request() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		httpRequest.header("Content-Type","application/json");
		response=httpRequest.post(BASE_URL+"/users");
	   System.out.println("response is"+response);
	}

	@Then("^I receive (\\d+) valid response$")
	public void i_receive_valid_response(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(201,response.getStatusCode());
	   
	}


}
