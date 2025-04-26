import java.util.*;
public class string_methods {
    public static void main(String[] args){
        String name="dharshini sarvanan";
        System.out.println(Arrays.toString(name.toCharArray()));
        //covert into char array-->[d, h, a, r, s, h, i, n, i,  , s, a, r, v, a, n, a, n]
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        //create the new object but name holds its original value after printing only
        // these will get erased by garabage collection

          //more methods available
        System.out.println(name.indexOf('a')); //return the 1st a index
        System.out.println(name.lastIndexOf('a'));
        System.out.println("   dharsh  " .strip()); //spaces removed
        System.out.println(Arrays.toString(name.split(" "))); //splits and make as array
    }
}
