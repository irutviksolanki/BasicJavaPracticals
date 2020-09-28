class Clone_meth  implements Cloneable
{

	int er_no;
	String name;

	public static void main(String ar[])
	{
		try
		{
		Clone_meth c1=new Clone_meth();
		c1.er_no=1;
		c1.name="Raj";
		
		Clone_meth c2= (Clone_meth)c1.clone();

		System.out.println(c2.er_no);
		System.out.println(c2.name);
		}
		catch(Exception e)
		{
			System.out.println("Sorry.......");
		}
		
	}	
	
	public Object clone()throws CloneNotSupportedException
	{
		//return super.clone();
		Clone_meth c3=new Clone_meth();
		
		c3.er_no=this.er_no;
		c3.name=this.name;

		return c3;
		
		
	}
}