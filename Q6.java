import java.util.TreeSet;
public class Q6
{
    public static void main(String[] args)
    {
        TreeSet <String> ts1 = new TreeSet<>();
        ts1.add("Spring");
        ts1.add("Winter");
        ts1.add("Autumn");
        ts1.add("Summer");
        System.out.print("Initial Tree Set: "+ts1+"\n");
        ts1.pollLast();
        System.out.println("After removing the last element: "+ts1);
    }
}
