/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

*/

public class problem10 {
	static boolean primchek(long n)
	{
		boolean t=true;
	if(n%2==0)
	{
		return false;
	}
	for(long i=3;i*i<=n;i=i+2)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
	}
	
	public static void sumPrime(int n)
	{
		long sum=2;
		long i=3;
	    while(i<n)
	    {
	    	if(primchek(i))
	    	{
	    		sum=sum+i;
	    	}
	    	i=i+2;
	    }
	    System.out.println(sum);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sumPrime(2000000);
	}

}
