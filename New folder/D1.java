class Con_Demo
{
	Con_Demo()
	{
		System.out.println(" Object Created");
	}
	Con_Demo(int a,int b)
	{
		System.out.println(a+b);
	}
	Con_Demo(String a,String b)
	{
		System.out.println(a+b);
	}

	public static void main(String ar[])
	{
		int a,b;
		
		Con_Demo C1=new Con_Demo();
		Con_Demo C2=new Con_Demo(10,20);
		Con_Demo C3=new Con_Demo("Go","od");
		

			
	}

}