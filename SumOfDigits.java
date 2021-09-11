package week1.day1;

public class SumOfDigits {
	
	public static void main(String[] args) {
		int x=123;
		int sum=0;
		int remainder;
		
		while (x>0) {
			
			remainder=x%10;
			System.err.println(remainder);
			sum=sum+remainder;
			System.out.println(sum);
			x=x/10;
			System.err.println(x);
		}
		System.out.println("final sum"+sum);
		
	}

}

// things i learnt from this code
// we need to initialise a variable if we need to do calculation
// we need to assign a value to the variable if we need to sum it to another variable
