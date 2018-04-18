package com.epam.webPlanner.repositories;

import com.epam.webPlanner.beans.Plan;
import com.epam.webPlanner.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanRepository extends CrudRepository<Plan, Integer> {
    public Plan findById(Integer id);
    List<Plan> findByUserId(Integer userId);
}
