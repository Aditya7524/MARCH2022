class A3_P9
{
	public static void main(String args[])
	{
		for(int i=1; i<=5;i++)
		{
			for (int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			int n = 65;
			for(int k=1; k<=i ; k++)
			{
				
				System.out.print((char)n+ " ");
				n++;
			}
			
			System.out.println();
		}
	}
}
