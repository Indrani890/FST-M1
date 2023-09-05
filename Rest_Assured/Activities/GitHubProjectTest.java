package LiveProject;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class GitHubProjectTest {
    RequestSpecification requestspec;

    ResponseSpecification responsespec;
    int SSHKeyId;
    String SSHKey= "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIMxy1ihsrwvhSOG92F7Ydo3imgip7FgPmXgn0rNDY7Y3";
    @BeforeClass
    public void setup() {
        //Create request specification
        requestspec = new RequestSpecBuilder().
                setBaseUri("https://api.github.com/user/keys").
                addHeader("Authorization", "token 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").
                addHeader("Content-Type", "application/json").build();

        //Create Response Specification
        responsespec = new ResponseSpecBuilder().
                expectResponseTime(lessThan(5000l)).
                expectBody("key", equalTo(SSHKey)).
                expectBody("title", equalTo("TestAPIKey")).build();

    }

    @Test(priority = 1)
    public void postRequestTest() {
        //RequestBody
        Map<String, String> reqBody = new HashMap<>();
        reqBody.put("title", "TestAPIKey");
        reqBody.put("key", SSHKey);

        //Generate Reponse
        Response response = given().spec(requestspec).body(reqBody).when().post();

        //Extract ID
        SSHKeyId = response.then().extract().path("id");

        //Assertion
        response.then().statusCode(201).spec(responsespec);
    }

    @Test(priority = 2)
    public void getRequestTest() {
        //Response
        given().spec(requestspec).pathParams("keyId", SSHKeyId).when().get("/{keyId}").
                then().statusCode(200).spec(responsespec);

    }

    @Test(priority = 3)
    public void deleteRequestTest() {
        //Response
        given().spec(requestspec).pathParams("keyId", SSHKeyId).when().delete("/{keyId}").
                then().statusCode(204).time(lessThan(3000l));

    }
}


