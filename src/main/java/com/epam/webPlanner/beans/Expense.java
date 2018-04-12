package com.epam.webPlanner.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by User on 05.04.2018.
 */
@Entity
public class Expense {
    @Id
    private String name;
    private Integer cost;
}
