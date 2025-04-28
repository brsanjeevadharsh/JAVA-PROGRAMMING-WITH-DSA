// To print numbers form 1 to 10.
class recursion2
{
	static void method(int i,int n)
	{
		if(i>n)
			return;
		System.out.println(i);
		method(i+1,n);
	}
	public static void main(String args[])
	{
		int n=10;
		method(1,n);
	}
}