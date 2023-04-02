import java.util.*;
public class Q11 {
    public static void main(String args[]) {
        TreeMap <Integer, String> arr = new TreeMap <>();
        arr.put(1,"A");
        arr.put(2,"B");
        arr.put(3,"C");
        arr.put(4,"D");
        arr.put(5,"E");
        System.out.println("Original TreeMap: " + arr);
        System.out.println("Keys greater than or equal to 1: " + arr.ceilingKey(1));
        System.out.println("Keys greater than or equal to 3: " + arr.ceilingKey(3));
        System.out.println("Keys greater than or equal to 6: " + arr.ceilingKey(6));
    }
}