package ConstructorOverloadingDemo;

import ConstructorOverloadingDemo.models.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Aryan");
        Person person3 = new Person("Aryan", 20);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
