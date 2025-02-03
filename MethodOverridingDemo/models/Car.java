package MethodOverridingDemo.models;

public class Car extends Vehicle {
    @Override
    public void displayInfo() {
        super.displayInfo();  // Calls the parent class method
        System.out.println("This is a car.");
    }
}
