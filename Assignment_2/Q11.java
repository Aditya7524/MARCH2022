import java.util.*;

class Q11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		double r;
		double P=0,A=0;
		
		System.out.print("\t Enter the radius of the circle : ");
		r =sc.nextDouble();
		
		P = 2*(Math.PI)*r;
		System.out.println("\t The Perimeter of circle is : "+P);
		
		
		P = (Math.PI)*r*r;
		System.out.println("\t The Perimeter of circle is : "+A);
			
	}
}