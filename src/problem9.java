/* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.*/


public class problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<1000;i++)
{
	for(int j=i+1;j<=1000;j++)
	{
		double k=Math.sqrt(Math.pow(i,2)+Math.pow(j, 2));
		if(i+j+k==1000)
		{
			System.out.println(i+","+j+","+k);
			double product=i*j*k;
			System.out.println("product="+product);
			break;
		}
	}
}
	}

}
