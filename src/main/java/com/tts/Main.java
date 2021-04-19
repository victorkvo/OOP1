package com.tts;
import java.util. ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("==== Dot Method ====");
        ArrayList<String> theList = new ArrayList<>();

        theList.add("First");
        theList.add("Second");

        int size = theList.size();

        System.out.println(size);
        System.out.println();

        String val = theList.get(1);

        System.out.println(val);

        System.out.println("==== CAR ====");

        Car car = new Car("blue", 4, "prius");
        Car car2 = new Car ("red", 2, "corvette");

        car.start();
        car.drive();
        car.stop();
//        System.out.println("==== CAR 1 ====");
//        System.out.println(car.color);
//        System.out.println(car.numberOfDoors);
//        System.out.println(car.model);
//
//        System.out.println("==== CAR 2 ====");
//        System.out.println(car2.color);
//        System.out.println(car2.numberOfDoors);
//        System.out.println(car2.model);
        System.out.println("==== SPORTY CAR ====");
        Car sporty = new Car("red", 2);
        sporty.start();
        sporty.drive();

        System.out.println("==== FAMILY CAR ====");
        Car family = new Car();
        family.setColor("gold");
        family.setNumberOfDoors(4);
        family.start();
        family.drive();

        System.out.println("==== OVERLOADING ====");
        car.drive();
        car.drive(194);
        car.drive(324, 440);
        car.drive("Texas");

        Drinks coke = new Drinks("coke", 140, true);

        System.out.println("==== DRINK STRING ====");
        System.out.println(coke.drink());

        System.out.println("==== DRINK BOOLEAN ====");
        System.out.println("Is this a low calorie drink? ");
        System.out.println(coke.lowCal());

        System.out.println("==== ADDITION ====");
        System.out.println(Calculator.add(10,20));

        System.out.println("==== SUBTRACTION ====");
        System.out.println(Calculator.subtract(20,10));

        System.out.println("==== MULTIPLICATION ====");
        System.out.println(Calculator.multiply(10,20));

        System.out.println("==== DIVISION ====");
        System.out.println(Calculator.divide(20,10));

        System.out.println("==== SQUARE ====");
        System.out.println(Calculator.square(10));

        System.out.println("==== SQUARE ROOT ====");
        System.out.println(MagicCalculator.sRoot(81));

        System.out.println("==== SINE ====");
        System.out.println(MagicCalculator.sin(35));

        System.out.println("==== COSINE ====");
        System.out.println(MagicCalculator.cos(35));

        System.out.println("==== TANGENT ====");
        System.out.println(MagicCalculator.tan(35));

        System.out.println("==== FACTORIAL ====");
        System.out.println(MagicCalculator.factorial(4));
    }
}
