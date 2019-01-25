import java.util.*;
import java.util.Scanner;
class arr
{
	public static void main(String args[])
	{
		int N,K,sum=0;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		K=s.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
		arr[i]=s.nextInt();		
		}
		for(int i=0;i<K;i++)
		{
			sum=sum+arr[i];
		}
			System.out.println(sum);
	}
}