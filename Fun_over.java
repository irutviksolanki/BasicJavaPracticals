import java.util.Scanner;
class Fun_over
{

				void add()
				{
					
					System.out.println("Hello");
				}
			
				void add(int a,int b)
				{
					
					System.out.println(a+b);
				}
			
				void add(float a,float b)
				{
					
					System.out.println(a+b);
				}
				char add(char a,char b)
				{
					return((char)(a+b));
					
				}
			String add(String a,String b)
				{
					return(a+b);
					
				}
			
	
	public static void main(String ar[])
	{
		int ch;
		System.out.println("Enter Your Choice : ");
		Fun_over F=new Fun_over();
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
		switch(ch)
		{
			case 1: 	F.add();
				break;
			
			case 2: 	F.add(10,20);
				break;
		
			case 3: 	F.add(10.5f,20.5f);
				break;
			case 4: 	System.out.println(F.add('a','b'));
				break;
			case 5: 	System.out.println(F.add("a","b"));
				break;
		}
		
		
	}
}