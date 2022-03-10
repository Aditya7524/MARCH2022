import java.util.*;

class Q6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("\t Enter the first Number : ");
		a =sc.nextInt();
		
		System.out.println("\t Enter the Second Number : ");
		b =sc.nextInt();
		
		System.out.println("\t The sum of the numbers : "+(a+b));
		System.out.println("\t The difference of the number : "+(a-b));
		System.out.println("\t The product of the numbers : "+(a*b));
		System.out.println("\t The division of the first w.r.t second number : "+(a/b));
		System.out.println("\t The modulus of the first w.r.t to second number : "+(a%b));
		
	}
}