// Parametric approach for the sum of the numbers
import java.util.*;
class recursion5
{
	static void method(int n,int sum)
	{
  	if(n<1)
  	{
  	System.out.println(sum);
  	return;
  }
  	method(n-1,sum+n);
  }
  public static void main(String args[])
  {
  	Scanner in = new Scanner(System.in);
  	System.out.println("Enter the number");
  	int n=in.nextInt();
  	int sum=0;
  	method(n,sum);
  }
}
