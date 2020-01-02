package com.michcinskilehmann.demo.controller;

import com.michcinskilehmann.demo.client.FoodClient;
import com.michcinskilehmann.demo.model.UserRequirements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FoodController {

    private FoodClient foodClient;

    @Autowired
    public FoodController(FoodClient foodClient){
        this.foodClient = foodClient;
    }

    @GetMapping("/")
    public String getMealPlan(Model model){
        model.addAttribute("requirements",new UserRequirements());
        return "home";
    }

    @PostMapping("nutritionPlan")
    public String addRequirements(@ModelAttribute UserRequirements userRequirements,Model model){
        model.addAttribute("mealPlan",foodClient.getNutritionModel(userRequirements.getCalories(),userRequirements.getPeriod(),userRequirements.getDiet(),userRequirements.getExclusion()));
        return "plan";
    }
}
