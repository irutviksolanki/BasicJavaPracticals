import java.util.*;
class Static_key
{

	static int a,b;
	static
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of A:  ");
		a=s.nextInt();
		System.out.println("Enter value of B:  ");
		b=s.nextInt();
	
	}
	public static void main(String ar[])
	{
		System.out.println("Addition is : "+(a+b));
		System.out.println("Subtraction is : "+(a-b));
		System.out.println("Multiphlication is : "+(a*b));
		System.out.println("Division is : "+(a/b));
		System.out.println("Modulation  is : "+(a%b));
	}

}