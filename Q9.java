import java.util.*;
public class Q9 {
    public static void main(String args[]){
        HashMap<Integer,String> m1= new HashMap<>();
        m1.put(1,"Rabbit");
        m1.put(2,"Penguin");
        m1.put(3,"Cat");
        Set keyset = m1.keySet();
        System.out.println("Key set values are: " + keyset);
    }
}
