package StringSplitter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        System.out.println("The words in the sentence are:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
