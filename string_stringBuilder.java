import java.util.*;
public class string_stringBuilder {
    public static void main(String[] args){
        StringBuilder series=new StringBuilder();
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);//which adds a's ascii value with i and returns the ascii char(type casting)
            //System.out.println(ch);
            series.append(ch);
//debug the program for better understanding
        }
        System.out.println(series.toString()); //toString() automatically called no explicit required
        //the advantage over here is it won't create the object again and again it just modify that is append the element
        //StringBuilder which is mutable
        //StringBuffer which is also overcome but buffered which takes time
        //lot of methods are there
        series.reverse();
        series.deleteCharAt(0);
    }
}
