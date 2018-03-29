package com.epam.webPlanner.beans;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String userName;
    private String role;
    private String firstName;
    private String lastName;
    private String password;


    public User() {
    }
    //change to builder pattern
    public User(Integer id, String username, String role, String firstName, String lastName, String password) {
        this.id = id;
        this.userName = username;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }
    public String getRole() {
        return role;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
 public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", role='" + role + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
