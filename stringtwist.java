// explanation enter the 3 string and change vowels in 1st as %,and consontants
// of 2nd as #, and 3rd string as uppercase
import java.util.*;


public class stringtwist {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String str1=sc.nextLine();
        System.out.println("Enter the string2");
        String str2=sc.nextLine();
        System.out.println("Enter the string3");
        String str3=sc.nextLine();
        String a=word1(str1);
        String b=word2(str2);
        String c=word3(str3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
    public static String word1(String str1){
         return str1.replaceAll("[AaEeIiOoUu]","%");

    }
    public static String word2(String str2){
        return str2.replaceAll("[^AaEeIiOoUu]","#");
    }
    public static String word3(String str3){
        return str3.toUpperCase();
    }

}
