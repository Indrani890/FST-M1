package LiveProject;


import au.com.dius.pact.consumer.dsl.DslPart;
import au.com.dius.pact.consumer.dsl.PactDslJsonBody;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

@ExtendWith(PactConsumerTestExt.class)
public class ConsumerTest {
    //create the header map
    Map<String, String> headers = new HashMap<>();

    //create the pact
    @Pact(consumer = "UserConsumer", provider = "UserProvider")
    public RequestResponsePact createPact(PactDslWithProvider builder) {
        //Set the header
        headers.put("Content-Type", "application/json");

        //Set the body
        DslPart RequestResponseBody = new PactDslJsonBody()
                .numberType("id", 123)
                .stringType("firstName", "Indrani")
                .stringType("lastName", "Dey")
                .stringType("email", "indrani890@gmail.com");

        //Write the contract
        return builder.given("request to create a user")
                .uponReceiving("request to create a user")
                .method("POST")
                .path("/api/users")
                .headers(headers)
                .body(RequestResponseBody)
                .willRespondWith()
                .status(201)
                .body(RequestResponseBody)
                .toPact();
    }

    @Test
    @PactTestFor(providerName = "UserProvider", port = "8282")
    public void PostRequestTest() {
        Map<String, Object> reqBody = new HashMap<>();
        reqBody.put("id", 123);
        reqBody.put("firstName", "Indrani");
        reqBody.put("lastName", "Dey");
        reqBody.put("email", "indrani890@gmail.com");
        // Send the post request
        given().baseUri("http://localhost:8282/api/users").headers(headers).body(reqBody).when().post().then().statusCode(201).log().all();

    }

}