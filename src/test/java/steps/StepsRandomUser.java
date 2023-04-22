package steps;

import models.RandomUserModel;

import static io.restassured.RestAssured.given;

public class StepsRandomUser {

    public RandomUserModel getRandomUser (){

        return given()
                .log().uri()
                .queryParams("gender", "male")
                .when()
                .get("https://randomuser.me/api/")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(RandomUserModel.class);
    }

    public RandomUserModel getRandomUser1 (){

        return given()
                .log().uri()
                .queryParams("nat", "US")
                .when()
                .get("https://randomuser.me/api/")
                .then()
                .log().body()
                .assertThat()
                .statusCode(200)
                .extract()
                .as(RandomUserModel.class);
    }
}
