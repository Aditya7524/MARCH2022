import java.util.*;

class Q19
{
	public static void main(String args[])
	{
		int N = 0,n=0;
		int rem=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t Enter a Number(>1): ");
		N = sc.nextInt();
		
		String s = "",bin = "";
		char ch;
		
		while(N>0)
		{
			rem = N%2;
			s = s+rem;
			N = N/2;
			n++;
		}
		
		for (int i=0;i<n;i++)
		{
			ch = s.charAt(i);
			bin = ch+bin;
		}
		
	
		System.out.print("\n\t Binary = "+bin) ;
		
		
	}
}