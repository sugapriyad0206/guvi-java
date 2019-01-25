import java.util.*;
import java.util.Scanner;
class leap
{
	public static void main(String args[])
	{
		int yr;
		System.out.println("Enter the year to check");
		Scanner s=new Scanner(System.in);
		yr=s.nextInt();
		if(yr%400==0||yr%100!=0&&yr%4==0)
			System.out.println("Yes");
	
		else
			System.out.println("No");
	}
}