package com.api.utility;

import cucumber.api.Scenario;
import io.restassured.http.ContentType;
import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class Support {


    private static Properties configProperties = new Properties();
    private PayloadTemplate payloadTemplate = new PayloadTemplate();


    /* Reads the config data property file */
    private static Properties readConfigDataFIle() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        configProperties.load(fis);
        return configProperties;
    }


    /* Returns value of key passed as argument from the config data property file */
    public static String getConfigDataFileData(String required_data) throws IOException {

        configProperties = readConfigDataFIle();
        required_data = configProperties.getProperty(required_data);
        return required_data;
    }


    public void getRequest(String uri) {
        ScenarioContext.response = when().get(uri + "/employees");
    }


    public void postRequest(String jsonFile, String uri) throws IOException {
        File file = new File("payload/" + jsonFile);
        payloadTemplate.writeToJSONFile(file);
        ScenarioContext.response = given().contentType(ContentType.JSON).body(file).post(uri + "/create");
    }


    public void printTotalEmployees() {
        System.out.println("* * * * * * * * * * * * The total number of employees created is: "+ScenarioContext.response.jsonPath().getList("id").size() + "* * * * * * * * * * * * ");
    }

    public void verifyResponseCode(int statusCode) {
//        System.out.println(ScenarioContext.response.body().print());
        Assert.assertEquals(statusCode, ScenarioContext.response.getStatusCode());
    }
}
