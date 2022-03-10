class A3_PS_2
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
		
				System.out.print("*");// can also use '+j'
				
			}
			
			
			System.out.println();//will go to next line
		}
	}
}