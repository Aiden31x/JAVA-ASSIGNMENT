package DigitSumCalculator;

import DigitSumCalculator.utils.NumberUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = NumberUtils.sumOfDigits(number);

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
}
