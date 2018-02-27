package com.epam.webPlanner.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Plannes {
    @Id
    Integer id;

}
