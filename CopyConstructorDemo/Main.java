package CopyConstructorDemo;

import CopyConstructorDemo.models.Person;

public class Main {
    public static void main(String[] args) {
        Person original = new Person("Aryan", 20);
        Person copy = new Person(original);

        System.out.println("Original: " + original);
        System.out.println("Copy: " + copy);
    }
}
