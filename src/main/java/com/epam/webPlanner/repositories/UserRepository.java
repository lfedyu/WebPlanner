package com.epam.webPlanner.repositories;

import com.epam.webPlanner.beans.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findById(Integer id);
    Set<User> findAll();
    public Set<User> findByFirstName(String firstName);


}
