import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		int number, tempNumber, digitValue, sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = input.nextInt();
		
		tempNumber = number;
		while(tempNumber != 0) {
			digitValue = tempNumber % 10;
			sum += digitValue;
			tempNumber /= 10;		
		}
		System.out.println("Sum of digits: " + sum);
	}
}
