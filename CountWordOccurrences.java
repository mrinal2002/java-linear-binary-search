import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CountWordOccurrences {
    public static void main(String[] args) {
        String filePath = "c:/my-java/example.txt"; // Path to the file
        String targetWord = "hello"; // Word to count
        int count = 0; // Counter for word occurrences

        try (FileReader fileReader = new FileReader(filePath); // Create FileReader
             BufferedReader bufferedReader = new BufferedReader(fileReader)) { // Wrap in BufferedReader

            String line;
            while ((line = bufferedReader.readLine()) != null) { // Read each line
                String[] words = line.split(" "); // Split line into words
                for (String word : words) {
                    if (word.equals(targetWord)) { // Check if word matches target
                        count++; // Increment counter
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        System.out.println("The word '" + targetWord + "' appears " + count + " times.");
    }
}