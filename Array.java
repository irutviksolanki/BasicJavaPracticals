import java.util.*;
class Array
{
	public static void main(String ar[])
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int sum=0;
		
		int i,j;
		System.out.println("Pls Enter Element of First Array : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				Scanner sc=new Scanner (System.in);
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Pls Enter Element of Second  Array : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				Scanner sc=new Scanner (System.in);
				b[i][j]=sc.nextInt();
			}
		}

		
		System.out.println("Element of First Array : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
				
			}
			System.out.println();
		}
			
		System.out.println("Element of Second Array : ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]+"\t");
				
		}
		System.out.println();
			}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
				
				sum=sum+a[i][k]*b[k][j];
							
				}
				c[i][j]=sum;
				sum=0;
			}
		}

		   System.out.println("Product of entered matrices:-");
 
        			 for ( i=0 ; i<3; i++)
       			  {
           				 for (j=0 ; j< 3; j++)
				{
          					System.out.print(c[i][j]+"\t");
					//System.out.print("hello");
				}
				System.out.println();
 
			}
	}
}