import java.util.Scanner;
class Practical_4
{
	public static void main(String arg[])
	{
		int no,i,max,smax;
		System.out.println("Enter size of array");
		Scanner ob=new Scanner(System.in);
		no=ob.nextInt();
		int a[]=new int[no];
		System.out.println("Enter array");
		for(i=0;i<no;i++)
		{
			a[i]=ob.nextInt();
		}
		max=a[0];
		for(i=0;i<no;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		smax=0;
		System.out.println("Max "+max);
		
		for(i=0;i<no;i++)
		{
				if(max>a[i])
				{
					if(smax<=a[i])
					{					
						smax=a[i];
					}
				}
				
				
		}
		System.out.println("Smax "+smax);
	}
}