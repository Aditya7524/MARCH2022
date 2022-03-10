class A3_P10
{
	public static void main(String args[])
	{
		for(int i=1; i<=5;i++)
		{
			for (int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			int n = 70;
			for(int k=1; k<=i ; k++)
			{
				
				System.out.print((char)(n-i)+ " ");
				n++;
			}
			
			System.out.println();
		}
	}
}
