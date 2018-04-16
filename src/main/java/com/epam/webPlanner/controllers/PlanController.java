package com.epam.webPlanner.controllers;


import com.epam.webPlanner.beans.Plan;
import com.epam.webPlanner.beans.User;
import com.epam.webPlanner.services.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanController {

    private PlanService planService;

    @Autowired
    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping("/user/{id}/planes")
    public List<Plan> getAllPlans(@PathVariable Integer id){
        return planService.getAllPlansForUser(id);
    }

    @GetMapping("/user/{userId}/planes/{id}")
    public Plan getPlanById(@PathVariable Integer id){
        return planService.getPlanById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/user/{userId}/planes/")
    public void addPlan(@RequestBody User user ){

        planService.addPlan(plan);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/user/{userId}/planes/{id}")
    public void updatePlan(@RequestBody Plan plan, @PathVariable Integer id ){
        planService.updatePlan(id, plan);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "users/{id}")
    public void addUser(@PathVariable Integer id ){
        userService.deleteUser(id);
    }
}
