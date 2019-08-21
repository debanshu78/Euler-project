/* The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/


public class problem6 {

	public static void main(String[] args) {
int sum=0;
int sum1=0;
int diff=0;
for(int i=1;i<=100;i++)
{
	sum=sum+(i*i);
	sum1=sum1+i;
}
diff=(sum1*sum1)-sum;
System.out.println("Difference="+ diff);

	}

}
