package CharacterFrequencyCounter;

import CharacterFrequencyCounter.utils.FrequencyUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        FrequencyUtils.countCharacterFrequency(input);
    }
}
