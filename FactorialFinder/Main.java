package FactorialFinder;

import FactorialFinder.utils.MathUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        long factorial = MathUtils.findFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
