import java.util.*;
class College 
{
	static String C_name="L.E.College";
	static int Er_no;
	static String S_name,D_name;
	
	College()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Enrollment No: ");
		Er_no=sc.nextInt();
		System.out.println("Enter Your Name : ");
		S_name=sc.next();
		System.out.println("Enter Your Department Name : ");
		D_name=sc.next();
	}	
}

class Dipartment extends College
{
	public static void main(String ar[])
	{
		College c1=new College();
		System.out.println("Your Enrollment No is 	: "+c1.Er_no);
		System.out.println("Your Name is		 : "+c1.S_name);
		System.out.println("Your Department Name is 	 : "+D_name);
		System.out.println("Your College Name is 		 : "+C_name);	
	
	}

}