import java.util.*;

public class removecharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string 1");
        String str1=sc.nextLine();
        System.out.println("enter the string 2");
        String str2=sc.nextLine();
        String result=removechar(str1,str2);
        System.out.println("the balance chracter in str1 is "+ result );
    }
    public static String removechar(String str1,String str2){
        StringBuilder result=new StringBuilder();
        boolean[] charset =new boolean[256];
        for(char ch:str2.toCharArray()){
            charset[ch]=true;
        }
        for(char ch:str1.toCharArray()){
            if(!charset[ch]){
                result.append(ch);
            }
        }
        return result.toString();
    }

}
