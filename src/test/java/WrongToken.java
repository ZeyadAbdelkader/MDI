import com.MDI.Task.controller.BaseController;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class WrongToken extends BaseController {
    private BaseController base = new BaseController();

    @Test
    public void InvalidToken() {
        String body = "{\n" +
                "\"email\": \"merchant@foodics.com\",\n" +
                "\"password\": \"123456\",\n" +
                "\"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xOzzz\"\n" +
                "}";

        RestAssured.useRelaxedHTTPSValidation();

        given()
                .spec(base.createRequest())
                .contentType("application/json")
                .when().body(body)
                .post("login").then().log().all().statusCode(200);
        //It Should return Status code 401 Unauthorized or 500,
        // but it will return 200 cause the token is static

    }



}