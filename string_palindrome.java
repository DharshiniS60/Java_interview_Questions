import java.util.*;
public class string_palindrome {
    public static void main(String[] args){
        String s="malayalam";
        System.out.println(palindrome(s));
    }
    public static boolean palindrome(String str){
        if(str==null || str.length()==0){
            return true;

        }
        else{
            for(int i=0;i<=str.length()/2;i++){ //here arr.length/2 because if half array changed and checking is enough
                //not to check the entire that takes time
                char start=str.charAt(i);
                //that len-1-i which checks as for 0 index last -1, for 2nd last -2 , for 3rd last -3..
                //for every time we minus i also
                char end=str.charAt(str.length()-1-i); // for int is arr.length for string its length()
                //actually both calls the same method and so the function while calculating the length
                //length() that transfers to each char and that they ar calculated
                if(start != end){
                    return false;
                }

            }
        }
        return true;
    }
}
