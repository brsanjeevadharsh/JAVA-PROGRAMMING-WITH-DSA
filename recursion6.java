Functional approach for the sum of the numbers.
class recursion6
{
	static int method(int n1)
	{
		if(n1<1)
		{
			return 0;
		}
		return n1 + method(n1-1);
	}
	public static void main(String args[])
	{
		int n1=5;
		System.out.println(method(n1));
	}
}