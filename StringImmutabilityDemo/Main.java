package StringImmutabilityDemo;

public class Main {
    public static void main(String[] args) {
        String original = "Hello";
        
        // String manipulation does not modify the original string
        String modified = original.concat(" World!");

        System.out.println("Original string: " + original);
        System.out.println("Modified string: " + modified);

        // Checking object references
        System.out.println("Are both strings pointing to the same object? " + (original == modified));
    }
}
