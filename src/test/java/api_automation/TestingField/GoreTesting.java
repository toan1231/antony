package api_automation.TestingField;
import static io.restassured.RestAssured.given;
import api_automation.dataProviderClass.GorestDataProviderClass;
import api_automation.requestBuilder.GoreRequestBuilder;

//import api_automation.utils.Log;
import api_automation.utils.Log;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;

import api_automation.utils.TestBase;

import io.restassured.response.Response;


import org.testng.Assert;
import org.testng.annotations.Test;

public class GoreTesting extends TestBase {

    @Test()
    public void user_create_requestData(String email, String name, String gender, String status) throws JsonProcessingException, InterruptedException {
        for (int i = 0; i < 3; i++) {


        for (int i=0;i<7;i++){
            System.out.println("4444333333333333");
            Thread.sleep(3000);
        }




        }
    }
}
