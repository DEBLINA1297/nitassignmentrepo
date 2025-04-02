package DAY4;

public class TinderDotCom {
	static void create(int age)throws TinderException
	{
	if(age>18)
	{
		System.out.println("You are eligible");
	}
	else
	{
		throw new TinderException("Invalid age");
	}
	}
public static void main(String[] args) { 
	
	try
	{
		create(17);
	}
	catch(TinderException e)
	{
		String x=e.getMsg();
		System.out.println(x);
	}
}
	
}
class TinderException extends Exception
{
	private String Msg;
	TinderException( String Msg)
	{
		this.Msg=Msg;
	}
	public String getMsg()
	{
		return Msg;
	}
}

