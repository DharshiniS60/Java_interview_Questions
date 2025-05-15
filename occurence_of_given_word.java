import java.util.*;
import java.util.Map;
public class occurence_of_given_word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine().toLowerCase();
        System.out.println("enter the string to count");
        String tofind=sc.nextLine();
        String[] arr = str.split(" ");
        int count=0;
        for (String word : arr) {
            if(word.equals(tofind)){
                count++;

            }
        }
        System.out.println("the no. of the given word occured in a string "+count);
    }
}
