package com.tts;

public class Drinks {
    private String name;
    private int calories;
    private boolean carbonation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isCarbonation() {
        return carbonation;
    }

    public void setCarbonation(boolean carbonation) {
        this.carbonation = carbonation;
    }

    public Drinks(String name, int calories, boolean carbonation) {
        this.name = name;
        this.calories = calories;
        this.carbonation = carbonation;
    }

    public Drinks(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }
    // String
    public String drink(){
        return name + " is a " + calories + " calorie beverage.";
    }
    // Boolean
    public boolean lowCal(){
        return calories <= 100;
    }
}
