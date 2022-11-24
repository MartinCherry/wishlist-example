package io.codelex.wishlistexample.user;

import io.codelex.wishlistexample.user.domain.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping()
    public String createUserList(@RequestBody UserRequest userList) {
        return this.service.createUsers(userList);
    }


}
