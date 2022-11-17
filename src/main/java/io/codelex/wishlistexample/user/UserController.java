package io.codelex.wishlistexample.user;

import io.codelex.wishlistexample.user.domain.UserRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping()
    public void createUserList(@RequestBody UserRequest userList) {
        this.service.createUsers(userList);
    }

    @GetMapping()
    public String getUserNames() {
        return this.service.getUserNames();
    }

}
