import java.util.*;
class n
{
public static void main(String s[])
{
	int a;
	Scanner sc = new Scanner(System.in);
	a=sc.nextInt();
	int i,j,count=0,prmcoun=0;
	{
		for(i=0;i<=a;i++)
		{
			if(i%a==0)
			{
				count++;
			}
			
				if(count==1)
				{
					System.out.println("your values is prime");
				}
				else
				{
					System.out.println("your values not prime");
				}
		}
	}
}
}