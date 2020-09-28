import java.util.*;
class Demob
{
	public static void main(String ar[])
	{    
		int no;
		System.out.println("Enter The NO : ");
		Scanner s=new Scanner(System.in);
		no=s.nextInt();
		int i,j,c=0,pc=0;
		for(i=0;i<no;i++)
		{
			if(no%i==1)
			{ 
				System.out.println("Hello");
				c++;
				System.out.println("Hello");
			}
		}
		if(c==1)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");

		}
	}
}