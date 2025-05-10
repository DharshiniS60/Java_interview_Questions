import java.util.*;
public class longestpalindromechexk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int result=checkpanlindrome(str);
        if(result==0){
            System.out.println("perfect");
        }
        else if(result==1){
            System.out.println("1 mismatch");
        }
        else{
            System.out.println("wrong");
        }
    }
    public static int checkpanlindrome(String str){
        int left=0,right=str.length()-1,mismatch=0;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                mismatch++;

            }
            if(mismatch>1){
                return 2;
            }
            left++;
            right--;
        }
        return mismatch;

    }
}
