class A3_PS_15
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			
			for(int k=1;k<=i;k++)
			{
					if(i==5)
					{
						System.out.print("*");
							continue;
					}
					else if(k==1)
						System.out.print("*");
					else if(k==i)
						System.out.print("*");
					else
						System.out.print(" ");
					
			}
			
			System.out.println();
		}
		
	}
}