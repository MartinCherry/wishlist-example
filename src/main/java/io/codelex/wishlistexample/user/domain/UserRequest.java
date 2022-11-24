package io.codelex.wishlistexample.user.domain;

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
