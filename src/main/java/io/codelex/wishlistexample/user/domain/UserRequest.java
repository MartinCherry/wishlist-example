package io.codelex.wishlistexample.user.domain;

import java.util.List;
import java.util.stream.Collectors;


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

    public String getUserListNamesToString() {
        return getUsers().stream().map(User::getName).collect(Collectors.joining(", "));
    }

}
