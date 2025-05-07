import java.util.*;
public class longestcommonsubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string1");
        String str1 = sc.nextLine();
        System.out.println("enter the string2");
        String str2 = sc.nextLine();
        String lcs = findings(str1, str2);
        String removed = revomedchar(str1, lcs);
        System.out.println("LCS balanced Character " + lcs);
        System.out.println("the length of  lcs " + lcs.length());
        System.out.println("the removed character " + removed);
        System.out.println("the removed char length " + removed.length());

    }

    public static String findings(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }

            }
        }
        StringBuilder lcs = new StringBuilder();
        int i = m;
        int j = n;
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                lcs.append(s1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;

            } else {
                j--;
            }
        }
        return lcs.reverse().toString();
    }

    public static String revomedchar(String s1, String lcs) {
        StringBuilder removes=new StringBuilder();
        int lcsindex=0;
        for(char ch:s1.toCharArray()){
            if(lcsindex<lcs.length() && ch==lcs.charAt(lcsindex)) {
                lcsindex++;
            }
            else{
                removes.append(ch);
            }
        }
        return removes.toString();
    }
}
