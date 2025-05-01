import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class findkanagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string1");
        String str1=sc.nextLine();
        System.out.println("enter the string2");
        String str2=sc.nextLine();
        System.out.println("enetr the k value");
        int k=sc.nextInt();
        if(isanagram(str1,str2,k)){
            System.out.println("yes they are anagrams");
        }
        else{
            System.out.println("no, they are not anagram");
        }
    }
    public static boolean isanagram(String s1,String s2, int k){
        if(s1.length()!=s2.length()){
            return false;
        }
        Map <Character,Integer> res=new HashMap<>();
        for(char c:s1.toCharArray()){
            res.put(c,res.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray()){
           if(res.containsKey(c)){
               res.put(c,res.get(c)-1);
               if(res.get(c)==0){
                   res.remove(c);
               }
           }
        }
        int change=0;
        for(int count:res.values()){
            change+=count;

        }
        return change<=k;
    }
}
