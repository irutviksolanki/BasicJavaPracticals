import java.util.Scanner;
class Check_prime_no
{
	public static void main(String a[])
	{
		int count=0,no,i,j,pc=0;
		Scanner obj= new Scanner(System.in);
		no=obj.nextInt();
		
		for(j=1;j<100;j++)
		{
			count=0;
			if(pc<no)
			{
				if(j==1)
				{
					System.out.println("your no is prime"+j);
					pc++;
				}
				else
				{
				for(i=1;i<j;i++)
				{
					if(j % i==0)
					{
						count++;
					}
				}
				if(count==1)
				{		
					System.out.println("your no is prime"+j);
					pc++;
				}
				}
			}
		}
			
		System.out.println("your prime no"+pc);
	}
}