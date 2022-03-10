//decimal to hexadecimal
import java.util.*;


class Q20
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int dec,rem,n=0;
		String hexa = "" ,hexaD = "";
		System.out.print("\n\t Enter a number : ");
		dec = sc.nextInt();
		
		while(dec>0)
		{
			rem = dec%16;
			if(rem==10)
			{
				hexa = hexa + "A";
			}
			
			else if(rem==11)
			{
				hexa = hexa + "B";
			}
			
			else if(rem==12)
			{
				hexa = hexa + "C";
			}
			
			else if(rem==13)
			{
				hexa = hexa + "D";
			}
			
			else if(rem==14)
			{
				hexa = hexa + "E";
			}
			
			else if(rem==15)
			{
				hexa = hexa + "F";
			}
			
			else
				hexa=hexa+rem;
			
			dec=dec/16;
			n++;
			
		}
	
		char ch;
		
		for (int i=0;i<n;i++)
		{
			ch = hexa.charAt(i);
			hexaD = ch+hexaD;
		}
		
		System.out.print("\n\t Hexadecimal form is "+hexaD);
	}
}