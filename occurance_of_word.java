import java.util.*;
import java.util.Map;

public class occurance_of_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine().toLowerCase();

        String[] arr = str.split(" ");
        Map<String, Integer> wordcount = new HashMap<>();
        for (String word : arr) {
            wordcount.put(word, wordcount.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordcount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
