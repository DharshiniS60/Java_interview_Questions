import java.util.*;
import java.util.Map;
import java.util.LinkedHashMap;

public class firstnonrepeatinginstring {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the string");
       String str=sc.nextLine();
       Character result=finding(str);
       if(result !=null){
           System.out.println("the first non repeating character is "+result);
       }
       else{
           System.out.println("no non repeating characters found");
       }
   }
   public static Character finding(String s) {
       Map<Character, Integer> m = new LinkedHashMap<>();
       s=s.toLowerCase();
       for(char c:s.toCharArray()){
           m.put(c,m.getOrDefault(c,0)+1);

       }
       for(Map.Entry<Character,Integer> enteries:m.entrySet()){
           if(enteries.getValue()==1){
               return enteries.getKey();
           }
       }
       return null;
   }

}
