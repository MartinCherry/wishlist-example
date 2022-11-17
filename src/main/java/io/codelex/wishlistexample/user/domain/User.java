package io.codelex.wishlistexample.user.domain;


public class User {

    private String type;
    private int id;
    private String name;
    private String email;

    public User(String type, int id, String name, String email) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
