//Binary to Decimal
import java.util.*;

class Q22
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
		
		System.out.println("\n\t Number in Decimal Form= "+sum);
	}
}