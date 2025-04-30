import java.util.*;
public class countfunc {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int digit=0,vowel=0,constant=0,splchar=0;
       for(char ch:str.toCharArray()){
           if(Character.isDigit(ch)){
               digit++;

           }
           else if("AEIOUaeiou".indexOf(ch)!=-1){
               vowel++;

           }
           else if(Character.isLetter(ch)){
               constant++;
           }
           else{
               splchar++;
           }

       }
       System.out.println("digit"+digit);
        System.out.println("vowel"+vowel);
        System.out.println("constant"+constant);
        System.out.println("splchar"+splchar);


    }
}
