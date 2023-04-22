package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.StepsRandomUser;

import static assertions.RandomUserAssert.responseAssert;

public class ApiTest extends StepsRandomUser {

    @Test
    @DisplayName("Крутой тест")
    void randomUserTest() {
        var response = getRandomUser();
        responseAssert(response);
    }

    @Test
    @DisplayName("Крутой тест1")
    void randomUserTest1() {
        var response = getRandomUser();
        responseAssert(response);
    }
}
