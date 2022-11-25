package io.codelex.wishlistexample.user;

import io.codelex.wishlistexample.user.domain.User;
import io.codelex.wishlistexample.user.dto.UserRequest;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class UserService {


    public String createUsers(UserRequest userList) {
        return userList.getUsers().stream().map(User::getName).collect(Collectors.joining(", "));
    }

}
