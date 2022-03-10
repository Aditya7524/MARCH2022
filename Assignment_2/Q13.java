import java.util.*;

class Q13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		double l,b;
		double Area=0;
		
		System.out.print("\n Enter the length of the rectangle : ");
		l =sc.nextDouble();
		
		System.out.print("\n Enter the breadth of the rectangle : ");
		b =sc.nextDouble();
		
		//System.out.print("\n Enter the Third Number : ");
		//c =sc.nextDouble();
		
		Area = l*b;
		System.out.println("\t The Area of the rectangle is  : "+Area);
			
	}
}