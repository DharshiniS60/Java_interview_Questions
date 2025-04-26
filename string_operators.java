import java.util.*;
//in java the operator overloading is not supported as c++ and python.
//that + symbol only operator that intensionally overloaded in  java string and just concat the strings
// but in c++ and python all operators can be overloaded and make use as we want which sometime led to poor coding
//refer the below important points that java don't allow to concat 2 user-defined or 2 complex datatype which should atleast hase one string datatype only that which is possible in those 2 languages

public class string_operators {
    public static void main(String[] args) {
        System.out.println('a' +'b');
        //adds the ascii value of a and b
        System.out.println("a"+"b"); //"a"+"b" --> new object created ab . then after printing the use of ab ends and the garbage collection takes place to delete ab
        //concat the string
        System.out.println('a'+3);
        //add tha ascii value +3
        System.out.println("a"+'b'); //ab here it just print b because cant able to add the value with the string
        System.out.println((char)('a'+3));
        //same as above adds and casting
        System.out.println("a"+3);
        //concat with that integer
        //note---> integer will converted to Integer that will call toString(
        //at the end , after few steps , it will be considered as "a"+"1"

        System.out.println("dharshini"+ new ArrayList<>());

        //returns the string with obj.since it is empty , it returns the empty array

        System.out.println("dharshini"+ new Integer(56));

     //====>System.out.println(new Integer(56)+new ArrayList<>());
        //which results in error =====>Operator '+' cannot be applied to 'java.lang.Integer', 'java.util.ArrayList<java.lang.Object>
  //---->important      //because, in java, the operator + in java only defined for primitives and any one of the value is a string

        System.out.println(new Integer(56)+""+new ArrayList<>()); //this will work, because, 1 in three ia a string
    }
}
