package com.epam.webPlanner.repositories;

import com.epam.webPlanner.beans.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepositoryJpa extends CrudRepository<User, Integer> {

    public User findById(Integer id);
    List<User> findAll();
    public List<User> findByFirstName(String firstName);
    public List<User> findByLastName(String lastName);
    public void addUser (User user);
    public void updateUser (Integer id, User user);
    public void deleteUser (Integer id);

}
