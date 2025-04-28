// Recursional approach for sum of numbers.
class recursion4
{
    static int sum=1;
    static int method(int n)
    {
        if(n<1)
            return sum;
        sum*=n;
        return method(n-1);
    }
public static void main(String args[])
{
    method(10);
    System.out.println(sum);
}
}

