package com.epam.webPlanner.services;

import com.epam.webPlanner.beans.Plan;
import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.repositories.PlanRepositoryJpa;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlanService {
    UserService userService;

    private PlanRepositoryJpa planRepository;
    Plan plan;

    public List<Plan> getAllPlansForUser(Integer userId){
        return userService.getUserById(userId).getPlanList();
    }

    public Plan getPlanById(Integer planId){
        plan = planRepository.findById(planId);
        return plan;
    }

    public void addPlan (Plan plan){
        planRepository.save(plan);
    }
    public void updatePlan (Integer id, Plan plan){
        planRepository.save(plan);
    }
    public void deletePlan (Integer id){
        planRepository.delete(id);
    }


}
