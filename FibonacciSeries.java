public class FibonacciSeries
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int fib1=0,fib2=1,fib3,i;
		System.out.print(fib1+" "+fib2+" ");
		for(i=1;i<=n;i++)
		{
			if(fib1+fib2<=n)
			{
				fib3=fib1+fib2;
				System.out.print(fib3);
				fib1=fib2;
				fib2=fib3;
			}
			if(fib1+fib2<=n)
			{
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}