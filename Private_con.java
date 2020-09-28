class Private_con
{
	int a;
	private Private_con()
	{
		a=10;
	}
	static Private_con ObjectCreated()
	{
		return (new Private_con());
	}

	public static void main(String ar[])
	{
		
		Private_con p1= ObjectCreated();
		System.out.println(p1.a);
	}

}