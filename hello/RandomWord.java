import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null;
        int i = 0;

        // Continue reading input until it's exhausted
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString(); // Read the next word
            i++;

            // Replace the champion with probability 1/i
            if (StdRandom.bernoulli(1.0 / i)) {
                champion = word;
            }
        }

        // Print the champion word after reading all words
        StdOut.println(champion);
    }
}
