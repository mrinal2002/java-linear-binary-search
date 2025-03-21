public class ComparePerformance {
    public static void main(String[] args) {
        int iterations = 1_000_000; // Number of concatenations
        String str = "hello"; // String to concatenate

        // Measure StringBuffer performance
        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(str); // Append using StringBuffer
        }
        long endTimeBuffer = System.nanoTime();
        long timeTakenBuffer = endTimeBuffer - startTimeBuffer;

        // Measure StringBuilder performance
        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(str); // Append using StringBuilder
        }
        long endTimeBuilder = System.nanoTime();
        long timeTakenBuilder = endTimeBuilder - startTimeBuilder;

        // Output the results
        System.out.println("Time taken by StringBuffer: " + timeTakenBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeTakenBuilder + " ns");
    }
}