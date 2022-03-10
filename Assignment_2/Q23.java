//Binary to hexadecimal

import java.util.*;

class Q23
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
		
		int dec=sum;
		n=0;
		String hexa="",hexaD="";
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
		//reversing the obtained in hexa to get required hexadecimal form
		for (int i=0;i<n;i++)
		{
			ch = hexa.charAt(i);
			hexaD = ch+hexaD;
		}
		
		System.out.print("\n\t Hexadecimal form is "+hexaD);
	}
}
		