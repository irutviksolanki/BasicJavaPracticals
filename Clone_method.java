class Clone_method implements Cloneable
{
	int er_no;
	String name;
	public static void main(String ar[])
	{
		try
		{
		Clone_method c1=new Clone_method();
		c1.er_no=1;
		c1.name="ABC";


		Clone_method c2=(Clone_method )  c1.clone();

		System.out.println(c2.name);
		}
		catch(Exception e)
		{
			System.out.println("Sorry... clonning not supported");
	
		}

	}
	public Object clone()throws CloneNotSupportedException
	{
		//return super.clone();

		Clone_method temp=new Clone_method();
		temp.er_no=this.er_no;
		temp.name=this.name;


		return temp;
			
	}
}