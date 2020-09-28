import java.util.*;

class Max
{
	public static void main(String r[])
	{
		int no;
		System.out.println("pls Enter The Size Of Array :");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		
		int a[]=new int[no];
		int i;
		int m;
		int z; 
		
		for(i=0;i<no;i++)
		{
			System.out.println("Enter The Value for  Array :");
			a[i]=s.nextInt();	
		}
			System.out.println(" Value Of Array :");
		for(i=0;i<no;i++)
		{
			System.out.println(a[i]);	
		}
		
			m=a[0];
			for(i=0;i<no;i++)
			{
				if(m<a[i])
				{
					m=a[i];
				
					if(m>a[i])
					{
						m=a[i];
					}
				}		
			}	
		System.out.println(" Max Value is : "+m);		
	}
}