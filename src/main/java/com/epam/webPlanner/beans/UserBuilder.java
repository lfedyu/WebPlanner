package com.epam.webPlanner.beans;

public class UserBuilder {
    private Integer id;
    private String username;
    private String role;
    private String firstName;
    private String lastName;
    private String password;

    public UserBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public UserBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder setRole(String role) {
        this.role = role;
        return this;
    }

    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public User createUser() {
        return new User(id, username, role, firstName, lastName, password);
    }
}