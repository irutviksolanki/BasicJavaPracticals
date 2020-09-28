import java.util.Scanner;
class Practical_5
{
	public static void main(String arg[])
	{
		int a,rev=0,d;
		Scanner ob = new Scanner(System.in);
		a=ob.nextInt();
		while(a!=0)
		{
			d=a%10;
			rev=rev*10+d;
			a=a/10;
		}
		System.out.println("Rev No is:-----"+rev);
	}
}