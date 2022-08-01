package TestRunner;
/*
This file help to run test cases via JUnit
Author:- Vaibhav Khachane
*/


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
      
        features = {"D:\\suvarna_eclipse\\Localhost_cucumber\\src\\test\\java\\features\\post.feature"},
        glue = {"StepDefination"},

        dryRun = false
       
)
public class post {

  
}
