import java.util.Scanner;
class P_5
{
	public static void main(String ar[])
	{
		int n,r=0;
		System.out.println("Pls Enter No : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0)
		{
			int t=n%10;
			r=(r*10)+t;
			n=n/10;
		}
		System.out.println("Revers No is :   "+r);
	}
}