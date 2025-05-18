import java.util.*;
import java.util.HashMap;
public class roman_to_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the roman");
        String str=sc.nextLine().toUpperCase();
        int result=findings(str);
        System.out.println("the equivalent number of the given roman is "+result);
    }
    public static int findings(String s){
        HashMap<Character,Integer> roman=new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int result=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            int current=roman.get(s.charAt(i));
            if(current<prev){
                result-=current;
            }
            else{
                result+=current;
            }
            prev=current;
        }
        return result;
    }
}
