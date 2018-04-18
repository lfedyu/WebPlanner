package com.epam.webPlanner.beans;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String userName;
    private String role;
    private String firstName;
    private String lastName;
    private String password;

    @ElementCollection(targetClass=Plan.class)
    private Set<Plan> planSet;

    public User() {
    }

    public User(Integer id, String username, String role, String firstName, String lastName, String password, Set<Plan> planSet) {
        this.id = id;
        this.userName = username;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.planSet = planSet;
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
    @OneToMany(cascade = CascadeType.ALL)
    public Set<Plan> getPlanSet() {
        return planSet;
    }

    public void setPlanSet(Set<Plan> planSet) {
        this.planSet = planSet;
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
                ", planSet=" + planSet.toString() +
                '}';
    }
}
