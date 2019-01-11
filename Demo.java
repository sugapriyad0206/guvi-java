import java.util.*;
import java.util.Scanner;
class Demo
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if(n < 0)
System.out.println(n +" "+"is negative");
if(n > 0)
System.out.println(n +" "+"is positive");
if(n == 0)
System.out.println("Given value is zero");
}
}