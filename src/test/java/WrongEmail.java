import com.MDI.Task.controller.BaseController;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class WrongEmail extends BaseController {
    private BaseController base = new BaseController();

    @Test
    public void InvalidEmail() {
        String body = "{\n" +
                "\"email\": \"merchantt@foodics.com\",\n" +
                "\"password\": \"123456\",\n" +
                "\"token\": \"Lyz22cfYKMetFhKQybx5HAmVimF1i0xO\"\n" +
                "}";

        RestAssured.useRelaxedHTTPSValidation();

        given()
                .spec(base.createRequest())
                .contentType("application/json")
                .when().body(body)
                .post("login").then().log().all().statusCode(500);

    }



}