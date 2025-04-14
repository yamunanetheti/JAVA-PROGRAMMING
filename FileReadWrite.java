import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        // Writing data to a file
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a sample text.\n");
            writer.write("This file is created using FileWriter in Java.");
            writer.close();
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading data from a file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("\nReading data from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
