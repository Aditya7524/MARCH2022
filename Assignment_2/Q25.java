//Octal Number to Decimal Number

import java.util.*;

class Q25
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int octa,n=0;
		int rem, sum=0;
		
		//System.out.print("\n\t Enter the bit size of Binary Number : ");
		//n = sc.nextInt();
		
		
		System.out.print("\n\t Enter the Octadecimal Number : ");
		octa = sc.nextInt();
		
		while(octa>0)
		{
			rem = octa%10;//getting immediate binary number(0/1)
			sum+= rem*(Math.pow(8,n));
			octa = octa/10;
			
			n++;
		}
		
		System.out.println("\n\t Number in Decimal Form= "+sum);
	}
}