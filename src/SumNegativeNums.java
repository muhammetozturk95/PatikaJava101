import java.util.Scanner;

public class SumNegativeNums {
	public static void main(String[] args) {
		int num, sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Bir sayi giriniz: ");
			num = input.nextInt();
			
			if(num%2 == 1)
				sum += num;
		} while(num > 0);
		
		System.out.println("Tek sayilarin toplami: " + sum);
	}
}
