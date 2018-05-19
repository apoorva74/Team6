package testJiraAPI;

import JiraRESTAPI.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static io.restassured.RestAssured.given;

public class CreateIssue extends ReusableMethods {
  Properties prop=new Properties();
    @BeforeTest
    public void getData() throws IOException
    {
        FileInputStream fis=new FileInputStream("C:\\Users\\apoor\\IdeaProjects\\NewWebAutomationTeam6\\BestBuy\\src\\main\\java\\JiraRESTAPI\\env.properties");
        prop.load(fis);
        //prop.get("HOST");
    }
    @Test
    public void JiraAPICreateIssue()
    {
        //Creating Issue/Defect
        RestAssured.baseURI= "http://localhost:8100";
        Response res=given().header("Content-Type", "application/json").
                header("Cookie","JSESSIONID="+ReusableMethods.getSessionKEY()).
                body("{"+
                        "\"fields\": {"+
                        "\"project\":{"+
                        "\"key\": \"RES\""+
                        "},"+
                        "\"summary\": \"Issue 5 for adding comment\","+
                        "\"description\": \"Creating my second bug\","+
                        "\"issuetype\": {"+
                        "\"name\": \"Bug\""+
                        "}"+
                        "}}").when().
                post("/rest/api/2/issue").then().statusCode(201).extract().response();
        JsonPath js= ReusableMethods.rawToJson(res);
        String id=js.get("id");
        System.out.println(id);
    }
}
