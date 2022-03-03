import java.util.Scanner;

class Scan
{
		public static void main (String args[])
		{
			Scanner sc = new Scanner(System.in);//declaration of scanner class object
			System.out.println("Enter the Name : ");//command user to give input
			String name = sc.next();//input from user 
			
			System.out.println("Name : "+name);//output
			
			System.out.println("Enter the N1 : ");//command user to give input
			int n1 = sc.nextInt();
			System.out.println("N1 : "+n1);//output
			
			System.out.println("Enter the N2 : ");//command user to give input
			int n2 = sc.nextInt();
			System.out.println("N2 : "+n2);//output
			
			int n = n1+n2;
			System.out.println("N : "+n);//output
		}
}
	