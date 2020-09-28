import java.util.*;
class Prime
{
public static void main(String s[])
{
	Scanner sc=new Scanner(System.in);
	
	int a,i,count=0;
	a=sc.nextInt();
			
				
				for(i=1;i<a;i++)
				{
		
					if(a%i==0)
					{
								count++;
		
					}
				}
		
						if(count==1)
						{
						System.out.println("your values is prime");
						}
						else
						{
							
						System.out.println("your values is not prime");
						
						}
		
					
				
			}
		}
