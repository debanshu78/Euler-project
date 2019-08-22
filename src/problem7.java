/* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number*/

public class problem5 {
public static int gcd(int num1,int num2)
{
	int gcd=1;
	for(int i = 1; i <= num1 && i <= num2; i++)
    {
        if(num1%i==0 && num2%i==0)
            gcd = i;
    }
	return gcd;
}
	public static void main(String[] args) {
	int lcm=1;
	for(int i=1;i<=20;i++)
	{
		int num=gcd(i,lcm);
		lcm=lcm/num*i;
	}
	System.out.println(lcm);
	}

}


