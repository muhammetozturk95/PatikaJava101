import java.util.Scanner;

public class FindEvenNumbers {
	public static void main(String[] args) {
		int k, i = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Bir sayi giriniz: ");
		k = input.nextInt();
		
//		for(int i = 0; i <= k; i++) {
//			if(i%2 == 0)
//			System.out.println(i);
//		}
		
		while(i <= k) {
			if(i%2 == 0)
			System.out.println(i);
			i++;
		}
	}
}
