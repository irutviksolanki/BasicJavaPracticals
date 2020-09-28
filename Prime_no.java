import java.util.*;
class Prime_no
{
public static void main(String s[])
{
	Scanner sc=new Scanner(System.in);
	
	int a,i,j,count=0,prmcoun=0;
	a=sc.nextInt();
	
		for(j=1;j<=100;j++)
		{
			count=0;
			if(prmcoun<a)
			{
			
			if(j==1)
			{
				prmcoun++;
				System.out.println("your values is prime"+j);
			}
			else
			{
				
				for(i=1;i<j;i++)
				{
		
					if(j%i==0)
					{
								count++;
		
					}
				}
		
						if(count==1)
						{
							prmcoun++;
						System.out.println("your values is prime"+j);
						}
		
					
			}	
			}
		}
	
}
}