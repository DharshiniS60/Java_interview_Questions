import java.util.*;
public class reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        String[] word=str.split(" ");
        StringBuilder result=new StringBuilder();
        for(int i=word.length-1;i>=0;i--){
            result.append(word[i]).append(" ");

        }
        System.out.println("result   " +result);
    }
}
