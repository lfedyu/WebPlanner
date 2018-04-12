package com.epam.webPlanner.beans;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

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
    @Column
    @ElementCollection(targetClass=Plan.class)
    private List<Plan> planList;

    public User() {
    }

    public User(Integer id, String username, String role, String firstName, String lastName, String password, List<Plan> planList) {
        this.id = id;
        this.userName = username;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.planList = planList;
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
