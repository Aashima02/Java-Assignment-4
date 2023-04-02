import java.util.HashSet;
public class Q5
{
    public static void main(String[] args)
    {
        HashSet <String> s1 = new HashSet<>();
        s1.add("P");
        s1.add("Q");
        s1.add("R");
        HashSet <String> s2 = new HashSet<>();
        s2.add("R");
        s2.add("P");
        s2.add("Q");
        boolean res = s1.equals(s2);
        if(res)
            System.out.println("Both the sets are equal");
        else
            System.out.println("The sets are not equal");
    }
}
