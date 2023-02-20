import java.util.Scanner;

public class CiftVeDordunKati {
	public static void main(String[] args) {
		int number, sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		
		
		
		do {
			System.out.print("Bir sayi giriniz: ");
			number = input.nextInt();
			
			if(number >= 0 && number%2 == 0 && number%4 == 0) {
				sum += number;
			}
		
		} while(number > 0);
		
		System.out.println("Cift ve dorde bolunebilen sayilarin toplami: " + sum);

	}
}
