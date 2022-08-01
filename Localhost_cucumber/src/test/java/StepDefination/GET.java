package StepDefination;


import org.junit.Assert;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GET {
	String BASE_URL="https://reqres.in";
	RequestSpecification request=RestAssured.given();
	Response response;
	
	@Given("^I set user services api endpoints$")
	public void i_set_user_services_api_endpoints() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		RestAssured.baseURI=BASE_URL;
	  
	}

	@When("^set request header$")
	public void set_request_header() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   request.header("Content-Type","application/json");
	}

	 @And("^send a get http request$")
	    public void send_a_get_http_request() throws Throwable {
	       
	   response= request.get(BASE_URL+"/api/users?page=2");
	}

	@Then("^I receive valid response$")
	public void i_receive_valid_response() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(200,response.getStatusCode());
	}
	


    

	}




