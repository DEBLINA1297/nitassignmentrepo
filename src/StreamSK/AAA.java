package StreamSK;

public class AAA {
	static void create(int age) throws TinderException
	{

	
	if(age>18)
	{
		System.out.println("You are allowed");
	}
	else
	{
		throw new TinderException("Invalid age");
	}
	}
public static void main(String[] args) {
	try {
		create(16);
	}
	catch(Exception e)
	{
		String x=e.getMessage();
		System.out.println(x);
	}
}
}
class TinderException extends Exception
{
	private String Message;
	TinderException(String Message)
	{
		this.Message=Message;
	}
	public String getMessage()
	{
		return Message;
	}
}
