/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/
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



