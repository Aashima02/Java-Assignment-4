import java.util.PriorityQueue;
public class Q7
{
    public static void main(String[] args)
    {
        PriorityQueue <String> q1 = new PriorityQueue<>();
        q1.add("Patroclus");
        q1.add("Achilles");
        q1.add("Briseis");
        System.out.print("Priority Queue: "+q1+"\n");
        String str1 = q1.toString();
        System.out.print("String Representation: "+str1);
    }
}
