package com.epam.webPlanner.repositories;

import com.epam.webPlanner.beans.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findById(Integer id);
    List<User> findAll();
    public List<User> findByFirstName(String firstName);


}
