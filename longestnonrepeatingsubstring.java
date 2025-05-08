import java.util.*;
import java.util.Set;
import java.util.Map;
public class longestnonrepeatingsubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String result = findings(str);
        System.out.println("the longest non-repeeating substring " + result);
    }

    public static String findings(String s) {
        HashSet<Character> set=new HashSet<>();
        int left=0;int maxlength=0;
        String sub="";
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            if(right-left+1>maxlength){
                maxlength=right-left+1;
                sub=s.substring(left,right+1);
            }
        }
        return maxlength+" "+sub;

    }

}