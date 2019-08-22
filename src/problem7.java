/* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number*/


public class problem7 {
	static boolean primchek(int n)
	{
	if(n%2==0)
	{
		return false;
	}
	for(int i=3;i*i<=n;i=i+2)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
	}
public static void postionPrime(int n)
{
	int i=3;
	int count=2;
	while(count<=n)
	{
		if(primchek(i))
		{
			count++;
		}
		i=i+2;
	}
	System.out.println(i-2);
    

}
	public static void main(String[] args) {
postionPrime(10001);
	}

}
