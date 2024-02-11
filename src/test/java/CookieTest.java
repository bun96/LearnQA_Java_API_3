import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CookieTest {
    @Test
    public void compareCookiesTest() {

        Response responseCheckAuth = RestAssured
                .given()
                .when()
                .post("https://playground.learnqa.ru/api/homework_cookie")
                .andReturn();

        Map<String, String> responseCookies = responseCheckAuth.getCookies();
        System.out.println(responseCookies);

        String cookieCheck = responseCheckAuth.getCookie("HomeWork");
        assertEquals("hw_value", cookieCheck);
    }
}
