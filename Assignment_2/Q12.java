import java.util.*;

class Q12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		double Avg=0;
		
		System.out.print("\n Enter the First Number : ");
		a =sc.nextDouble();
		
		System.out.print("\n Enter the Second Number : ");
		b =sc.nextDouble();
		
		System.out.print("\n Enter the Third Number : ");
		c =sc.nextDouble();
		
		Avg = (a+b+c)/3;
		System.out.println("\t The Average : "+Avg);
			
	}
}