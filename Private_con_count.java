class Private_con_count
{
	static int count=0;
	int a;
	private Private_con_count()
	{
		a=10;
		System.out.println(count+"       Object is Created ");
	}
	static Private_con_count ObjectCreated()
	{

		count++;
		return new Private_con_count();
		

	}

	public static void main(String ar[])
	{
		
		Private_con_count p1= ObjectCreated();
		System.out.println(p1.a);
		
		Private_con_count p2= ObjectCreated();
		System.out.println(p2.a);
	}

}