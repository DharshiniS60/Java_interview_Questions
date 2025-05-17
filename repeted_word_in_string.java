import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class repeted_word_in_string { // not word character
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine().toLowerCase();

        char[] arr=str.toCharArray();
        Map<Character,Integer> charcount=new HashMap<>();
        for(char ch:arr) {
            if (Character.isLetter(ch)) {
                charcount.put(ch, charcount.getOrDefault(ch, 0) + 1);
            }
        }
        for(Map.Entry<Character,Integer> entry:charcount.entrySet()){
            if(entry.getValue()>1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
