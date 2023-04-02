import java.util.HashSet;
public class Q4
{
    public static void main(String[] args)
    {
        HashSet <String> s1 = new HashSet<>();
        s1.add("Ruby");
        s1.add("Emerald");
        s1.add("Sapphire");
        System.out.print("Initial HashSet: "+s1+"\n");
        s1.clear();
        System.out.print("After removal of elements: "+s1);
    }
}
