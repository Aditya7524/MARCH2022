class A3_PS_5
{
		public static void main(String args[])
	{
		
		
		for (int i=1;i<=5;i++)
		{
			
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++)
			{	
		
				System.out.print("*");
			
			}
			
			for(int m=1;m<i;m++)
			{
				System.out.print("*");
			}
			
			System.out.println();//will go to next line
		}
	}
}