import java.util.*;

public class string_performance {
    public static void main(String[] args){
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);//which adds a's ascii value with i and returns the ascii char(type casting)
            //System.out.println(ch);
            series+=ch;
//debug the program for better understanding
        }
        System.out.println(series);
/*disadvantage
        1-->series ='a'
        2-->series="a"  +'b' ="ab"
        3-->series="ab"+'c'="abc"
        4-->series="abc"+'d'="abcd" and so on
        that the string is immutable.
        so for every iteration it creates a new object and the garbage collection
        takes place to delete the previously created object
        That a,ab,abc,abcd... all have no reference variable-->which is a wastage of space
        that results in time complexity O(N^2)
         */
        //to overcome this we can have some modifyable object. but the string is not modifyable which is immutable
        //series="abc"+'d' should be series="abcd" without creating new object
        //then the complexity will be n times -->O(n)
        //now the stringBuilder comes
        //refer that in string_stringBuilder file


    }
}
