import java.util.*;
import java.util.Scanner;
class count
{
	public static void main(String args[])
	{
		int N,count=0;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		while(N>0)
		{
		N=N/10;
count++;		
		}
			System.out.println(count);
	}
}