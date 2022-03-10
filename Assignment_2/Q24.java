//Binary to Octal Number

import java.util.*;

class Q24
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int Binary,n=0;
		int rem, sum=0;
		
		System.out.print("\n\t Enter the Binary Number : ");
		Binary = sc.nextInt();
		
		while(Binary>0)
		{	
			rem = Binary%10;//getting immediate binary number(0/1)
			sum+= rem*(Math.pow(2,n));
			Binary = Binary/10;
			n++;
		}
		
		int dec = sum;
		n=0;
		String octa = "" ,octaD = "";
		
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
		
		System.out.print("\n\t Octadecimal form is "+octaD);
	}
}