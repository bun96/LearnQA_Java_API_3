import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeaderTest {
    @Test
    public void findHeaderTest(){

        Response response = RestAssured
                .given()
                .when()
                .get("https://playground.learnqa.ru/api/homework_header")
                .andReturn();

        String responseHeaders = response.getHeader("x-secret-homework-header");
        System.out.println("The header is " + responseHeaders);
        assertEquals("Some secret value", responseHeaders, "Header is not equal");
    }
}