/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

*/


public class problem10 {
	public static void sumPrime(int n)
	{
		long sum=2;
		long i=3;
	    int count=2;
	    while(i<2000000)
	    {
	    	boolean count1=true;
	    	for(int j=2;j<=Math.sqrt(i)+1;j++)
	    	{
	    		if(i%j==0)
	    		{
	    			count1=false;
	    			break;
	    		}
	    	}
	    	if(count1==true)
	    	{
	    		sum=sum+i;
	    		count++;
	    	}
	    	i=i+2;
	    }
	    System.out.println(sum);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sumPrime(10);
	}

}
