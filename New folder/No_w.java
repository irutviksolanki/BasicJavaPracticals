import java.util.*;
class No_w
{
	public static void main(String ar[])
	{
		String e[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
                              	String d1[]={"eleven","tewlve","thirteen","fourteen","fifthteen","sixteen","seventeen","eighteen","nineteen"};
		String d2[]={"Ten","Twenty","Thirty","Fourty","fifty","Sixty","Seventy","Eighty","Ninety"};

		int no;
		int count=0;
		

		String w="";

		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter NO:");
		no=sc.nextInt();
		int o=no;	
		if(no==0)
		{
			System.out.println("zero");
		}
		else
		{

		while(no>0)
		{
			int temp=no%10;
			count++;

			switch(count)
			{
				case 1:
					w=w+e[temp];	
					break;
				case 2:
					if(o>=11 && o<20)
					{
						int t=o%10;

						w=d1[t-1];
						break;
					}
					else
					{
						if((o%10)!=0)
						{
						w=d2[temp-1]+" "+w;
						}
						else
						{
							if((o%100)>=1 && (o%100)<=99 ){
							w=d2[temp-1];}
						}
					}
					break;

					case 3:
						int b=o%10;
						if(b==0)
						{
							int t1=o/100;	
							w=e[t1]+" hundread   ";
								
							break;
						}
						else
						{
							w=e[temp]+"   hundread and  "+w;
							break;
						}
					
					}
			
			no=no/10;

			}
			
			System.out.println(w);
		}
	}
}