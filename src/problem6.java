/* The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/


public class problem6 {

	public static void main(String[] args) {
long n=(100*101)/2;
long sumsquare=n*n;

long squaresum=(100*(100+1)*(2*100+1))/6;
long diff=sumsquare-squaresum;
System.out.println("Difference="+ diff);

	}

}
