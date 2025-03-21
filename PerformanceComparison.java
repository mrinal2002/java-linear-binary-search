import java.io.*;

public class PerformanceComparison {
    public static void main(String[] args) {
        // Part 1: StringBuilder vs StringBuffer
        compareStringConcatenation();

        // Part 2: FileReader vs InputStreamReader
        String filePath = "largefile.txt"; // Replace with the path to your large file
        compareFileReading(filePath);
    }

    // Part 1: Compare StringBuilder and StringBuffer performance
    private static void compareStringConcatenation() {
        String str = "hello";
        int iterations = 1_000_000;

        // StringBuilder
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(str);
        }
        long endTimeBuilder = System.nanoTime();
        long timeTakenBuilder = endTimeBuilder - startTimeBuilder;

        // StringBuffer
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(str);
        }
        long endTimeBuffer = System.nanoTime();
        long timeTakenBuffer = endTimeBuffer - startTimeBuffer;

        // Print results
        System.out.println("StringBuilder time: " + timeTakenBuilder + " ns");
        System.out.println("StringBuffer time: " + timeTakenBuffer + " ns");
    }

    // Part 2: Compare FileReader and InputStreamReader performance
    private static void compareFileReading(String filePath) {
        // FileReader
        long startTimeFileReader = System.nanoTime();
        int wordCountFileReader = countWordsWithFileReader(filePath);
        long endTimeFileReader = System.nanoTime();
        long timeTakenFileReader = endTimeFileReader - startTimeFileReader;

        // InputStreamReader
        long startTimeInputStreamReader = System.nanoTime();
        int wordCountInputStreamReader = countWordsWithInputStreamReader(filePath);
        long endTimeInputStreamReader = System.nanoTime();
        long timeTakenInputStreamReader = endTimeInputStreamReader - startTimeInputStreamReader;

        // Print results
        System.out.println("FileReader word count: " + wordCountFileReader);
        System.out.println("FileReader time: " + timeTakenFileReader + " ns");
        System.out.println("InputStreamReader word count: " + wordCountInputStreamReader);
        System.out.println("InputStreamReader time: " + timeTakenInputStreamReader + " ns");
    }

    // Count words using FileReader
    private static int countWordsWithFileReader(String filePath) {
        int wordCount = 0;
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length; // Split on whitespace
            }
        } catch (IOException e) {
            System.err.println("Error reading file with FileReader: " + e.getMessage());
        }
        return wordCount;
    }

    // Count words using InputStreamReader
    private static int countWordsWithInputStreamReader(String filePath) {
        int wordCount = 0;
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                wordCount += line.split("\\s+").length; // Split on whitespace
            }
        } catch (IOException e) {
            System.err.println("Error reading file with InputStreamReader: " + e.getMessage());
        }
        return wordCount;
    }
}