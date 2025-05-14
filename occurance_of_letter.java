import java.util.*;
import java.util.Map.*;
public class occurance_of_letter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine().toLowerCase();
        char[] arr = str.toCharArray();
        Map<Character, Integer> charcount = new HashMap<>();
        for (char ch : arr) {
            if (Character.isLetter(ch)) {
                charcount.put(ch, charcount.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charcount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
