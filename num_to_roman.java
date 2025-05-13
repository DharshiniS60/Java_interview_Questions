import java.util.*;
import java.util.HashMap;
public class num_to_roman {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number(0-3999)");
        int num=sc.nextInt();
        String result=findings(num);
        System.out.println("the equivalent roma for the given number is "+result);

    }
    public static String findings(int num){
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbol={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder equroman=new StringBuilder();
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                num-=values[i];
                equroman.append(symbol[i]);
            }
        }
        return equroman.toString();
    }
}
