package ArraySumFinder;

import ArraySumFinder.utils.ArrayUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = ArrayUtils.findSum(numbers);

        System.out.println("Sum of all elements: " + sum);
    }
}
