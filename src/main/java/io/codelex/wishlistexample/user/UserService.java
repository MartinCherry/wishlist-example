package io.codelex.wishlistexample.user;

import io.codelex.wishlistexample.user.domain.UserRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void createUsers(UserRequest userList) {
        this.repository.createUserList(userList);
    }

    public String getUserNames() {
        return this.repository.getUserNames();
    }

}
