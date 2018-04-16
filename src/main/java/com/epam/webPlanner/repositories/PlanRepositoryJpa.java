package com.epam.webPlanner.repositories;

import com.epam.webPlanner.beans.Plan;
import com.epam.webPlanner.beans.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanRepositoryJpa extends CrudRepository<Plan, Integer> {
    public Plan findById(Integer id);
    List<Plan> findAllForUser(Integer id);
    public void addPlan (Plan plan);
    public void updatePlan (Integer id, Plan plan);
    public void deletePlan (Integer id);
}
