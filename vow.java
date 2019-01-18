import java.util.*;
import java.io.*;
import java.util.Scanner;
class vow
{
	public static void main(String args[])

	{
		char n;
		Scanner s=new Scanner(System.in);
		n=s.next().charAt(0);
		if(n>='a' && n<='z')
		{
	if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
		System.out.print("Vowel");
		
			
	else
		System.out.print("Consonant");
		
	}
	else
		System.out.print("invalid");
}
}