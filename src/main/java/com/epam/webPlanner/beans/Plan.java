package com.epam.webPlanner.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Plan {
    @Id
    @GeneratedValue( strategy= GenerationType.AUTO )
    private Integer id;
    private String description;
    private Integer income;
    @Column
    @ElementCollection(targetClass=Expense.class)
    private List<Expense> expences;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    public Plan() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public List<Expense> getExpences() {
        return expences;
    }

    public void setExpences(List<Expense> expences) {
        this.expences = expences;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
