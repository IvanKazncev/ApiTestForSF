package assertions;

import models.RandomUserModel;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomUserAssert {
    public static void responseAssert(RandomUserModel response) {
        assertThat(response).as("ошибка").isNotNull();
        assertThat(response.getResults().get(0).getGender()).as("проверяем пол").isEqualTo("male");
    }
}
