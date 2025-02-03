package StringReverser;

import StringReverser.utils.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        String reversed = StringUtils.reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
}
