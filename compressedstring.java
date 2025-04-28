import java.util.*;
public class compressedstring {  //a3b5u8..
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String result=compress(str);
        System.out.println("the compressed string is  "  + result);
    }
    public static String compress(String s){
        StringBuilder st=new StringBuilder();
        int count =1;
        for(int i=0;i<s.length();i++){
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                st.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        return st.length()<s.length()?st.toString():s;
    }
}
