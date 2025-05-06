import java.util.*;
import java.util.Map;
//enter the string
//        dharshini
//enter the value of lexi(k):
//        3
//the string after lexi is adhrhsini

public class lexicography {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        System.out.println("enter the value of lexi(k): ");
        int k=sc.nextInt();
        String result=findings(str,k);
        System.out.println("the string after lexi is " +result);

    }
    public static String findings(String str,int k){
        char[] arr=str.toCharArray();
        int n=arr.length;
        for(int i=0;i<n && k>0;i++){
            int midindex=i;
        for(int j=i+1;j<n && j-i<=k;j++){
            if(arr[j]<arr[midindex]){
                midindex=j;
            }
        }
        for(int j=midindex;j>i;j--){
            char temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
        }
        k-=(midindex-i);
        }
        return new String(arr);

    }
}
