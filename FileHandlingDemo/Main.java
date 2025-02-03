package FileHandlingDemo;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filename = "example.txt";

        // Write to file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a file handling demonstration in Java.");
            System.out.println("Data written to file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from file
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Reading from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
