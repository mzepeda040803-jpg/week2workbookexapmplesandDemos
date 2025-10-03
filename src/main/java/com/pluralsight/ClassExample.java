package com.pluralsight;

public class ClassExample {

    public static void main(String[] args) {
        //Car car1 = new Car();
        //car1.setMake("Nissan"); //Toyota camry will show up if you comment out nissan altima
        //car1.setModel("Altima");
        //car1.display();
        Car car1 = new Car("Nissan", "Altima");
        car1.display();

        //System.out.println(car1.getMake() + " " + car1.getModel());

        Car car2 = new Car();
        car2.setMake("Kia");
        car2.setModel("Sorrenta");
        car2.display();

       // System.out.println(car2.getMake() + " " + car2.getModel());









    }
}
