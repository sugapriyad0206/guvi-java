import java.util.*;
import java.util.Scanner;
class big
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter the 3 values");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b && a>c)
			System.out.println(a);
		else if(b>a && b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}
}