package io.codelex.wishlistexample.user;

import io.codelex.wishlistexample.user.domain.User;
import io.codelex.wishlistexample.user.dto.UserRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {

    @Test
    public void shouldReturnUsers() {
        String expectedResult = "Josh, Josh, Josh, Josh, Josh";
        UserRequest testUserRequest = createUserRequest();
        String result = new UserService().createUsers(testUserRequest);
        Assertions.assertEquals(expectedResult, result);
    };

    private UserRequest createUserRequest() {
        User testUser = new User("User", 1, "Josh", "josh@inbox.lv");
        List<User> testUserList = new ArrayList<>();
        for (int i = 0; i<5; i++) {
            testUserList.add(testUser);
        }
        return new UserRequest(testUserList);
    }

}
