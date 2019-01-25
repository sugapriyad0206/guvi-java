import java.util.*;
import java.util.Scanner;
class alpha
{
	public static void main(String args[])
	{
		char ch;
		System.out.println("Enter the character to check");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if(ch>='a' && ch<='z' || ch >='A' && ch <='Z')
			System.out.println("Alphabet");
	
		else
			System.out.println("No");
	}
}