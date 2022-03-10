//decimal to Octal
import java.util.*;


class Q21
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int dec,rem,n=0;
		String octa = "" ,octaD = "";
		System.out.print("\n\t Enter a number : ");
		dec = sc.nextInt();
		
		while(dec>0)
		{
			rem = dec%8;
			
			octa=octa+rem;
			
			dec=dec/8;
			
			n++;
			
		}
	
		char ch;
		
		for (int i=0;i<n;i++)
		{
			ch = octa.charAt(i);
			octaD = ch+octaD;
		}
		
		System.out.print("\n\t Octal form is "+octaD);
	}
}