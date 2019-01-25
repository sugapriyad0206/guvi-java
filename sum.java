import java.util.*;
import java.util.Scanner;
class sum
{
	public static void main(String args[])
	{
		int N,sum=0;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		for(int i=1;i<=N;i++)
		{
			sum=sum+i;
		}
			System.out.println(sum);
	}
}