package MultilevelInheritanceDemo;

import MultilevelInheritanceDemo.models.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();         // Inherited from Animal
        dog.walk();        // Inherited from Mammal
        dog.bark();        // Defined in Dog
    }
}
