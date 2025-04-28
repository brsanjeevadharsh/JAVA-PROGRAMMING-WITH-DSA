// Java program to find the factorial of a number using recursion.
class recursion10
{
	static int method(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*method(n-1);
	}
	public static void main(String args[])
	{
		int n=3;
		System.out.println(method(n));
	}
}