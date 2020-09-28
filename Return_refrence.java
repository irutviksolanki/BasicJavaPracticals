import java.util.*;
class Return_refrence
{
	static int a,b;		
	 static Return_refrence val()
	{
		 Return_refrence p1=new Return_refrence();
		Scanner sc= new Scanner(System.in);
		System.out.println("Pls Enter A : ");
		p1.a=sc.nextInt();
		System.out.println("Pls Enter B :");
		p1.b=sc.nextInt();
		
		return p1;
		
	}
	public static void main(String ar[])
	{
		val();
		System.out.println("Value of A :"+a);
		System.out.println("Value of B :"+b);
		System.out.println("Value of A: "+(a+b));
	}
}