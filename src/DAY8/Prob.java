package DAY8;

public class Prob {
final static void send (int a)
{
	System.out.println(a);
}
final static void send (String b)
{
	System.out.println(b);
}
public static void main(String[] args) {
	{
		send("Deblina");
		send(10);
	}
}
}
