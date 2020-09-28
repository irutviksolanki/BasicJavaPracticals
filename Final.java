class Final
{
	Final()
	{
		a=10;
	}
	final int a;
	public static void main(String ar[])
	{
		Final f1=new Final();
		System.out.println(f1.a);
		f1.a=20;
		System.out.println(f1.a);	
	}
}