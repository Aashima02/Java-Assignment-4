import java.util.ArrayList;
public class Q1
{
    public static void main(String[] args)
    {
        ArrayList <String> a1 = new ArrayList<>();
        a1.add("Tris");
        a1.add("Teresa");
        a1.add("Katniss");
        System.out.print("First List: "+a1+"\n");
        ArrayList <String> a2 = new ArrayList<>();
        a2.add("Tobias");
        a2.add("Thomas");
        a2.add("Peeta");
        System.out.print("Second List: "+a2+"\n");
        ArrayList <String> aj = new ArrayList<>();
        aj.addAll(a1);
        aj.addAll(a2);
        System.out.print("Joined List: "+aj);
    }
}
