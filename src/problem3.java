/* The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/




import java.math.BigInteger;

public class problem3 {
static void chekPrime(long n)
{
	if(n>0)
	{
	int bigprime=2;
	while(n%2==0)
	{
		n=n/2;
	}
	
	for(int i=3;i<=Math.sqrt(n);i=i+2)
	{
		while(n%i==0)
		{
			n=n/i;
			bigprime=i;
		}
	}
		if(n>2)
		{
		System.out.println("lagest prime="+n);
		}
		else
		{
			System.out.println("largest prime factor="+2);
		}
	}
	else
	{
		System.out.println("not possible");
	}
}

	public static void main(String[] args) throws java.lang.Exception  {
		// TODO Auto-generated method stub
		chekPrime(600851475143l);
	}}
