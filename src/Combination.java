/*
 C(n,r) = n! / (r! * (n-r)!)
 */

import java.util.Scanner;

class CalculateFactorial {
	public int Factorial(int num) {
		int fact = 1;
		
		for(int i = 1; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
}

public class Combination {
	public static void main(String[] args) {
		int n, r, comb;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number n: ");
		n = input.nextInt();
		
		System.out.print("Enter number r: ");
		r = input.nextInt();
		
		CalculateFactorial obj = new CalculateFactorial();
		
		comb = obj.Factorial(n) / (obj.Factorial(r) * obj.Factorial(n-r));
		System.out.println(comb);	
	}
}
