class A3_P2
{
		public static void main(String args[])
	{
		
		
		
		for (int i=1;i<=5;i++)
		{
			int a = 65;
			for (int j=1;j<=i;j++)
			{	
				char c = (char)a;
				System.out.print(c+" ");// can also use '+j'
				a++;
				
			}
			
			System.out.println();//will go to next line
		}
	}
}