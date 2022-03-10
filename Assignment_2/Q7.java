import java.util.*;

class Q7
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.print("\t Enter the Number : ");
		a =sc.nextInt();
		
		//System.out.println("\t Enter the Second Number : ");
		//b =sc.nextInt();
		
		System.out.println("\t The multiplication table of the number : \n");
			
		for(int i=1;i<=10;i++)
		{	
			
			System.out.println("\t"+a+" X "+i+"\t=\t"+(a*i)+" \n");
			
		}
	}
}