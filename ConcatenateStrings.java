public class ConcatenateStrings {
    public static void main(String[] args) {
        // Input array of strings
        String[] strings = {"Hello", " ", "World", "!"};

        // Concatenate strings using StringBuffer
        String concatenatedString = concatenateStrings(strings);

        // Output the result
        System.out.println("Concatenated String: " + concatenatedString);
    }

    // Concatenates an array of strings using StringBuffer
    public static String concatenateStrings(String[] strings) {
        StringBuffer stringBuffer = new StringBuffer(); // Create StringBuffer
        for (String str : strings) {
            stringBuffer.append(str); // Append each string
        }
        return stringBuffer.toString(); // Return concatenated result
    }
}