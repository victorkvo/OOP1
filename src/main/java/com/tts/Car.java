package com.tts;

public class Car {

    private String color;
    private int numberOfDoors;
    private String model;
    private int currentRPM;
    private int speed;


    public int getCurrentRPM() {
        return currentRPM;
    }

    public void setCurrentRPM(int rpm) {
        currentRPM = rpm;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        setCurrentRPM(calculateRPM(speed));
    }


    private int calculateRPM(int speed)
    {
        int rpm = 0;

        // represents a real rpm calcuation
//        rpm = speed * getBestGear(speed) * engineFactor();
        rpm = speed * 0;

        return rpm;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if ( numberOfDoors >= 1 && numberOfDoors <= 6)
            this.numberOfDoors = numberOfDoors;
        else
            this.numberOfDoors = 1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void start() {
        System.out.println("Car starting");
    }

    public void stop() {
        System.out.println("Car stopping");
    }

    // Just start driving
    public void drive() {
        System.out.println("Car driving");
    }

    // Drive for the specified number of miles
    public void drive(int miles)
    {
        System.out.println("Driving for " + miles + " miles.");
    }

    // Drive specified miles at the specified speed
    public void drive(int miles, int speed)
    {
        System.out.println("Driving " + speed + "mph for " + miles + " miles.");
    }

    // drive to the specified destination
    public void drive(String destination)
    {
        System.out.println("Driving to " + destination);
    }

//    public Car()
//    {
//        color = "White";
//        numberOfDoors = 2;
//    }

    // constructor with arguments
    public Car(String color, int doors, String model)
    {
        this.color = color;
        this.numberOfDoors = doors;
        this.model = model;
    }
    public Car() { }

    public Car(String color, int doors)
    {
        this.color = color;
        this.numberOfDoors = doors;
    }

    // constructor with a single argument
//    public Car(String color)
//    {
//        this.color = color;
//        this.numberOfDoors = 4;
//    }
}


