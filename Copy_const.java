class Copy_const
{
	int er_no;
	String name;
	String cname;
	Copy_const(){}

	Copy_const(Copy_const temp)
	{
		this.er_no=temp.er_no;
		this.name=temp.name;
		this.cname=temp.cname;
	}

	public static void main(String ar[])
	{
		Copy_const c1=new 	Copy_const ();

		c1.er_no=1;
		c1.name="abc";
		c1.cname="LE";


		Copy_const c2=new 	Copy_const (c1);

		System.out.println(c2.er_no);

		Copy_const c3=new 	Copy_const ();
		c3.er_no=c1.er_no;
		c3.name=c1.name;
		c3.cname=c1.cname;

		System.out.println(c3.er_no);




	}
}