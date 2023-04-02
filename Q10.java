import java.util.*;
public class Q10 {
    public static void main(String args[]) {
        TreeMap <Integer, String> tm1 = new TreeMap<>();
        tm1.put(1,"Red");
        tm1.put(2,"Green");
        tm1.put(3,"Black");
        tm1.put(4,"White");
        tm1.put(5,"Blue");
        System.out.println("Original TreeMap: " + tm1);
        System.out.println("Keys greater than or equal to 1: " + tm1.ceilingEntry(1));
        System.out.println("Keys greater than or equal to 3: " + tm1.ceilingEntry(3));
        System.out.println("Keys greater than or equal to 6: " + tm1.ceilingEntry(6));
    }
}
