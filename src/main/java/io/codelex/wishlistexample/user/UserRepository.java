package io.codelex.wishlistexample.user;

import io.codelex.wishlistexample.user.domain.UserRequest;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private UserRequest users;

    public void createUserList(UserRequest userList) {
        this.users = userList;
    }

    public String getUserNames() {
        return this.users.getUserListNamesToString();
    }

}
