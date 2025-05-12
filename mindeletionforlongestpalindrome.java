import java.util.*;
public class mindeletionforlongestpalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int result=findings(str);
        System.out.println("The minimum deletion character to make the string palindrome is "+result);
    }
    public static int findings(String s1){
        int len=s1.length();
        String s2= new StringBuilder(s1).reverse().toString();
        //to find the lps do the lcs first , so
        int lcs=findlcs(s1,s2);
        return len-lcs;
    }
    public static int findlcs(String s1, String s2){
        int m=s1.length();
        int[][] dp=new int[m+1][m+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][m];
    }
}
