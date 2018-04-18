package com.epam.webPlanner.controllers;


import com.epam.webPlanner.beans.Plan;
import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.beans.UserBuilder;
import com.epam.webPlanner.services.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
public class PlanController {

    private PlanService planService;

    @Autowired
    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping("/user/{id}/planes")
    public Set<Plan> getAllPlans(@PathVariable Integer id){
        return planService.getAllPlansForUser(id);
    }

    @GetMapping("/user/{userId}/planes/{id}")
    public Plan getPlanById(@PathVariable Integer id){
        return planService.getPlanById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/{userId}/planes")
    public void addPlan(@RequestBody Plan plan, @PathVariable Integer userId ){
        plan.setUser(new UserBuilder().setId(userId).createUser());
        planService.addPlan(plan);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/user/{userId}/planes/{id}")
    public void updatePlan(@RequestBody Plan plan, @PathVariable Integer userId, @PathVariable Integer id ){
        plan.setUser(new UserBuilder().setId(userId).createUser());
        planService.updatePlan(plan);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "users/{id}/planes/{id}")
    public void deletePlan(@PathVariable Integer id ){
        planService.deletePlan(id);
    }
}
