public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        String reversedString = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }

    // Reverses a string using StringBuilder
    public static String reverseString(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse(); // Reverse the string
        return stringBuilder.toString(); // Convert back to string
    }
}