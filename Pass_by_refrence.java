import java.util.*;
class Pass_by_refrence
{
	static int a,b;		
	public static void main(String ar[])
	{
		 Pass_by_refrence p1=new Pass_by_refrence();
		Scanner sc= new Scanner(System.in);
		System.out.println("Pls Enter A : ");
		p1.a=sc.nextInt();
		System.out.println("Pls Enter B :");
		p1.b=sc.nextInt();
		
		val(p1);
		
	}
	static void val(Pass_by_refrence temp)
	{
		System.out.println("Value of A :"+temp.a);
		System.out.println("Value of B :"+temp.b);
		System.out.println("Value of A: "+(temp.a+temp.b));
	}
}