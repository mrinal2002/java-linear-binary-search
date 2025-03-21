public class LinearSearchWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {"Hello world", "This is a test", "Find the word", "Java programming"};
        String word = "test";
        String result = findSentenceWithWord(sentences, word);
        System.out.println("Sentence containing the word: " + result);
    }

    public static String findSentenceWithWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the sentence containing the word
            }
        }
        return "Not Found"; // Word not found in any sentence
    }
}