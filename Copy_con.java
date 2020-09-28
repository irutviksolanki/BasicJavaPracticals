class Copy_con
{

	int Er_No;
	String Name;
	String Cname;
	Copy_con(){}
	 Copy_con(Copy_con temp)
	{
		
		this.Er_No=temp.Er_No;
		this.Name=temp.Name;
		this.Cname=temp.Cname;	
	
	

	}		

	public static void main(String ar[])
	{
		Copy_con C1=new Copy_con();		
		
		C1.Er_No=1;
		C1.Name="Prashant";
		C1.Cname="LEC";
		

		Copy_con C2=new Copy_con(C1);

		System.out.println(C2.Er_No);
		
		System.out.println(C2.Name);
		
		System.out.println(C2.Cname);
		
		Copy_con C3=new Copy_con();

		C3.Er_No=C1.Er_No;
		C3.Name=C1.Name;
		C3.Cname=C1.Cname;

		System.out.println(C3.Er_No);
		
		System.out.println(C3.Name);
		
		System.out.println(C3.Cname);


	
	}

}