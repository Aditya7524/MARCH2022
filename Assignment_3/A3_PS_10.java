class A3_PS_10
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=5;k++)
			{
				System.out.print("*");
			}
			
			/*for(int l=1;l<i;l++)
			{
				System.out.print("*");
				
			}*/
			
			System.out.println();
		}
		
		
		for(int i=1;i<=4;i++)
		{
			
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=5;k>=1;k--)
			{
				System.out.print("*");
			}
			
			/*for(int l=4;l>i;l--)
			{
				System.out.print("*");
				
			}*/
			
			
			System.out.println();
		}
	}
}