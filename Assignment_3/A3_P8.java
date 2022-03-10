class A3_P8
{
	public static void main(String args[])
	{
		for(int i=1; i<=5;i++)
		{
			for (int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			int n = 6;
			for(int k=1; k<=i ; k++)
			{
				
				System.out.print((n-i)+ " ");
				n++;
			}
			
			System.out.println();
		}
	}
}
