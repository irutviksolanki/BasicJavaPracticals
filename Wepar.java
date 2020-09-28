import java.util.*;
class Wepar
{
	public static void main(String ar[])
	{
		int a;
		float b;
		a=Integer.parseInt(ar[0]);
		b=Float.parseFloat(ar[1]);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		
		char c;
		
		c=(char)(int)(a+b);
		System.out.println(c);

		if(c>=65 && c<=90)
		{
			System.out.println( Character.toLowerCase(c));
		}
		if(c>=97 && c<=122)
		{
			System.out.println( Character.toUpperCase(c));
		}
		
		System.out.println("Hello"+c);
		
		Long l;

		l=(long)c;

		System.out.println(l);
		
		Double d1;
		d1=(double)l;
		System.out.println(d1);

		Boolean b1=true;
		boolean bool=b1;

		System.out.println(bool);
		System.out.println(new Wepar());
	
	}
		public String toString()
		{
			return "This object is Create an Wepar class";
		}

}

