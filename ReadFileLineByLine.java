import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        String filePath = "c:/my-java/example.txt"; // Path to the file

        try (FileReader fileReader = new FileReader(filePath); // Create FileReader
             BufferedReader bufferedReader = new BufferedReader(fileReader)) { // Wrap in BufferedReader

            String line;
            while ((line = bufferedReader.readLine()) != null) { // Read each line
                System.out.println(line); // Print the line
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}