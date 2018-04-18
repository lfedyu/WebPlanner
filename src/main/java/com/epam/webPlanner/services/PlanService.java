package com.epam.webPlanner.services;

import com.epam.webPlanner.beans.Plan;
import com.epam.webPlanner.repositories.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PlanService {

    private PlanRepository planRepository;

    public List<Plan> getAllPlansForUser(Integer userId){
        List <Plan> plannes = new ArrayList<>();
        planRepository.findByUserId(userId).
                forEach(plannes::add);
        return plannes;
    }

    public Plan getPlanById(Integer planId){
        return planRepository.findById(planId);
    }

    public void addPlan (Plan plan){
        planRepository.save(plan);
    }
    public void updatePlan (Plan plan){
        planRepository.save(plan);
    }
    public void deletePlan (Integer id){
        planRepository.delete(id);
    }


}
