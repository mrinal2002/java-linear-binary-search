import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ByteToCharacterStream {
    public static void main(String[] args) {
        String filePath = "example.txt"; // Path to the file
        String charset = "UTF-8"; // Charset for encoding

        try (FileInputStream fileInputStream = new FileInputStream(filePath); // Read binary data
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, charset); // Convert to character stream
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) { // Read characters efficiently

            String line;
            while ((line = bufferedReader.readLine()) != null) { // Read each line
                System.out.println(line); // Print the line
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}