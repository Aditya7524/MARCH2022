//Multiply two binary

import java.util.*;

class Q18
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n=0, Binary1, n1, Binary2, n2;
		int rem, rem1, rem2, product=0, sum1=0, sum2=0;
		
		System.out.print("\n\t Enter the bit size of first Binary Number : ");
		n1 = sc.nextInt();
		
		System.out.print("\n\t Enter the first Binary Number : ");
		Binary1 = sc.nextInt();
		
		for(int i=0;i<=n1;i++)
		{
			rem1 = Binary1%10;//getting immediate binary number(0/1)
			sum1+= rem1*(Math.pow(2,i));
			Binary1 = Binary1/10;
			
			if(Binary1==0) break;
		}
		
		System.out.println("\n\t First Binary Number in Decimal Form= "+sum1);

	

		System.out.print("\n\t Enter the bit size of second Binary Number : ");
		n2 = sc.nextInt();
		
		System.out.print("\n\t Enter the secondBinary Number : ");
		Binary2 = sc.nextInt();
		
		
		
		for(int i=0;i<=n2;i++)
		{
			rem2 = Binary2%10;//getting immediate binary number(0/1)
			sum2+= rem2*(Math.pow(2,i));
			Binary2 = Binary2/10;
			
			if(Binary2==0) break;
		}
		
		System.out.println("\n\t Second Binary Number in Decimal Form= "+sum2);
		
		
		product = sum1*sum2 ;
		
		System.out.println("\n\t  product in decimal form= "+product);
		
		/*if(n1<n2) n=n2;
		else n=n1;*/
		
		String s = "", binary = "";
		
		while(product>0)
		{
			rem = product%2;
			s = s+rem;
			product = product/2;
			n++;
		}
		
		char ch;
		
		for (int i=0;i<n;i++)
		{
			ch = s.charAt(i);
			binary = ch+binary;
		}
		/*for(int i=0;i<=n;i++)
		{
			rem = sum%2;
			Binary +=rem;
			Binary = Binary*10;
		}*/
		
		System.out.println("\n\t Product of Binary number is = "+binary);
		
		
	}
}