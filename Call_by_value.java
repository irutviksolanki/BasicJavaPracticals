import java.util.*;
class Call_by_value
{
	
	public static void main(String ar[])
	{
		 int a,b;		
		Scanner sc= new Scanner(System.in);
		System.out.println("Pls Enter A : ");
		a=sc.nextInt();
		System.out.println("Pls Enter B :");
		b=sc.nextInt();
		val(a,b);
		
	}
	static void val(int x,int y)
	{
		System.out.println("Ans is : "+(x+y));
		
	}
}