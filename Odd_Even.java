import java.util.*;
import java.util.Scanner;
class Odd_Even
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter the number\n");
n=sc.nextInt();
if(n < 0 || n == 0)
{
System.out.println("Invalid");
}
else if(n % 2 == 0)
{
System.out.println("Even");
}
else
{
System.out.println("Odd");

}
}
}
