package io.codelex.wishlistexample.user.dto;

import io.codelex.wishlistexample.user.domain.User;

import java.util.List;


public class UserRequest {

    private List<User> users;

    public UserRequest(List<User> users) {
        this.users = users;
    }

    public UserRequest() {

    }

    public List<User> getUsers() {
        return this.users;
    }

    public void setUser(List<User> users) {
        this.users = users;
    }


}
