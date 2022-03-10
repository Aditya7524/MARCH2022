class A3_PS_6
{
		public static void main(String args[])
	{
		
		for (int i=1;i<=5;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for (int j=5;j>=i;j--)
			{	
			
				System.out.print("*");
			
			}
			for(int l=4;l>=i;l--)
			{
				System.out.print("*");
			}
			
			System.out.println();//will go to next line
		}
	}
}