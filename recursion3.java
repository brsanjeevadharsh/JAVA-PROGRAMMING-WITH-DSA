// To print numbers from 10 to 1
class recursion3
{
	static void method(int i,int n)
	{
		if(i>n)
			return;
		System.out.println(n);
		method(i,n-1);
	}
	public static void main(String args[])
	{
		int n=10;
		method(1,n);
	}
}