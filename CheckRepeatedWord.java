import java.util.*;

public class CheckRepeatedWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the word to check: ");
        String word = scanner.next();

        String[] words = str.split(" ");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String w : words) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }
        if (wordCount.getOrDefault(word, 0) > 1) {
            System.out.println("The word '" + word + "' is repeated " + wordCount.get(word) + " times.");
        } else {
            System.out.println("The word '" + word + "' is not repeated.");
        }
    }

}
