import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String stringWithoutDuplicates = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String without Duplicates: " + stringWithoutDuplicates);
    }

    // Removes duplicate characters while maintaining order
    public static String removeDuplicates(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<Character> seenCharacters = new HashSet<>(); // Track seen characters
        for (char ch : input.toCharArray()) {
            if (!seenCharacters.contains(ch)) { // If character is not a duplicate
                stringBuilder.append(ch); // Append to result
                seenCharacters.add(ch); // Mark as seen
            }
        }
        return stringBuilder.toString(); // Convert back to string
    }
}