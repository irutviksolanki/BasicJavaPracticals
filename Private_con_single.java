class Private_con_single
{
	static Private_con_single temp=null;
	int a;
	private Private_con_single()
	{
		a=10;
	}
	static Private_con_single ObjectCreated()
	{
		if(temp==null)
		{
		temp =new Private_con_single();
		}
		return temp;

	}

	public static void main(String ar[])
	{
		
		Private_con_single p1= ObjectCreated();
		System.out.println(p1.a);
		
		Private_con_single p2= ObjectCreated();
		System.out.println(p2.a);
	}

}