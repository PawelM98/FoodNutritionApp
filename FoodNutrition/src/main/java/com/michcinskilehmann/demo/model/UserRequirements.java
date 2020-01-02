package com.michcinskilehmann.demo.model;

public class UserRequirements {
    private String calories;
    private String period;
    private String diet;
    private String exclusion;

    public UserRequirements(String calories, String period, String diet, String exclusion) {
        this.calories = calories;
        this.period = period;
        this.diet = diet;
        this.exclusion = exclusion;
    }

    public UserRequirements() {
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getExclusion() {
        return exclusion;
    }

    public void setExclusion(String exclusion) {
        this.exclusion = exclusion;
    }

}
