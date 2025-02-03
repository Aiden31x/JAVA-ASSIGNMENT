package ArrayReverser;

import ArrayReverser.utils.ArrayUtils;

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

        ArrayUtils.reverseArray(numbers);

        System.out.print("Reversed array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
