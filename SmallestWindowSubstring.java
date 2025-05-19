
import java.util.HashMap;
import java.util.Scanner;

public class SmallestWindowSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter S1 (main string): ");
        String S1 = scanner.nextLine();
        System.out.print("Enter S2 (characters to be found): ");
        String S2 = scanner.nextLine();
        String result = findSmallestWindow(S1, S2);
        if (result.isEmpty()) {
            System.out.println("No such window exists.");
        } else {
            System.out.println("Smallest window: " + result);
        }
    }

    public static String findSmallestWindow(String S1, String S2) {
        if (S1.length() < S2.length()) return ""; // Edge case: S2 is longer than S1

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : S2.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1); // Store S2 character frequencies
        }

        int left = 0, minLength = Integer.MAX_VALUE, minStart = 0, required = charCount.size(), matched = 0;
        HashMap<Character, Integer> windowCount = new HashMap<>();

        for (int right = 0; right < S1.length(); right++) {
            char c = S1.charAt(right);
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1);

            if (charCount.containsKey(c) && windowCount.get(c).equals(charCount.get(c))) {
                matched++; // Character fully matched
            }

            while (matched == required) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }

                char leftChar = S1.charAt(left);
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);

                if (charCount.containsKey(leftChar) && windowCount.get(leftChar) < charCount.get(leftChar)) {
                    matched--; // Character removed, no longer fully matched
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : S1.substring(minStart, minStart + minLength);
    }
}