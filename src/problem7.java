/* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number*/



public class problem7 {
public static void postionPrime(int n)
{
	long i=3;
    int count=2;
    while(count<=n)
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
