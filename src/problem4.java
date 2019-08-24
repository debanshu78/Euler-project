/* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/



public class problem4 {
	public static int checkPalindrum(int x)
	{
		String s=""+x;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
		rev=rev+s.charAt(i);	
		}
		if(s.equals(rev))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void main(String[] args) {
	int max=1000;
	int i,j = 0;
	int k=0,l=0;
for(i=100;i<1000;i++)
{
	for(j=101;j<1000;j++)
	{
		int product=i*j;
		if(checkPalindrum(product)==1)
		{
			if(product>max)
			{
			max=product;
			k=i;
			l=j;
			}	
		}
	}
}
System.out.println(k+"*"+l+"="+max);
	}

}
