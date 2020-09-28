import java.util.*;
class Call_by_refrence
{
	
	public static void main(String ar[])
	{
		 int a,b;		
		Scanner sc= new Scanner(System.in);
		System.out.println("Pls Enter A : ");
		a=sc.nextInt();
		System.out.println("Pls Enter B :");
		b=sc.nextInt();
		
		System.out.println("Ans is : "+val(a,b));
		
	}
	static int val(int x,int y)
	{
		return (x+y);
		
	}
}