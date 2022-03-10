class A3_P5
{
		public static void main(String args[])
	{
		
		
		int a = 65;
		for (int i=1;i<=5;i++)
		{
			
			for (int j=1;j<=i;j++)
			{	
				char c = (char)a;
				System.out.print(c+" ");// can also use '+j'
				
				
			}
			a++;
			
			System.out.println();//will go to next line
		}
	}
}