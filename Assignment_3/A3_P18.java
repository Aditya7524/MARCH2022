class A3_P18
{
	public static void main(String args[])
	{
		
		for(int i=1; i<=5;i++)
		{
			
			int n = 65;
			for(int k=5; k>=i ; k--)
			{
				
				System.out.print((char)n+ " ");
				n++;
			}
			
			System.out.println();
		}
	}
}

