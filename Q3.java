import java.util.LinkedList;
public class Q3
{
    public static void main(String[] args)
    {
        LinkedList <String> l1 = new LinkedList<>();
        l1.add("Purple");
        l1.add("Cyan");
        l1.add("Magenta");
        l1.add("Lilac");
        if(l1.contains("Cyan"))
            System.out.println("Cyan is present in the given list");
        else
            System.out.println("Cyan is not present in the given list");
    }
}
