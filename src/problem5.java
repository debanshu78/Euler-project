/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/



public class problem5 {
public static void smallestMultiple(int t)
{
	int n=2;
x:	
while(n>1)
{
	boolean d=true;
	for(int i=6;i<=t;i++)
	{
		
		if(n%i==0)
		{
			d=true;
		}
		else {
			d=false;
			break;
		}
	}
	if(d==true)
	{
		System.out.println(n);
		break x;
		
	}
	n=n+1;
}
}

	public static void main(String[] args) {
	
smallestMultiple(20);
	}

}
