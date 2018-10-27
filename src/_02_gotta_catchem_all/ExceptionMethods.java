package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide (double d1, double d2)
	{
		if(d2  == 0)
		{
			throw new IllegalArgumentException();
		}
		else
		{
		double retval = d1/d2;
		return retval;
		}
	}
	public String reverseString(String str)
	{
		if(str.equals(""))
		{
			throw new IllegalStateException();
		}
		else
		{
		StringBuilder strB = new StringBuilder();
		strB.append(str);
		
		String revStr = strB.reverse().toString();

		return revStr;
	}
}
}
