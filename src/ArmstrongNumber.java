/*
 * Örneğin 407 sayısını ele alalım. 
 * (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 
 * sonucunu verir. Bu da 407 sayısının armstrong bir sayı 
 * olduğunu gösterir.

 * 1342 sayısına da bakalım. 
 * (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 
 * 1342’ye eşit olmadığı için armstrong sayı olmaz.
 */

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int sayi;
		
		Scanner input = new Scanner(System.in);
		System.out.print("bir sayi giriniz: ");
		
		sayi = input.nextInt();
		
		// basamak sayısını bulma
		
		int geciciSayi = sayi, basamakSayisi = 0;
		while(geciciSayi != 0) {
			geciciSayi /= 10;
			basamakSayisi++;
		}
		
		//System.out.println(basamakSayisi);
		
		// sayı basamaklarının üslerini alıp toplama

		geciciSayi = sayi;
		int basamakDegeri, basamakUsDegeri, toplam = 0;
		
		while(geciciSayi != 0) {
			basamakDegeri = geciciSayi % 10;
			basamakUsDegeri = 1;
			
			for(int i = 1; i <= basamakSayisi; i++) {
				basamakUsDegeri *= basamakDegeri;			
			}
			toplam += basamakUsDegeri;
			geciciSayi /= 10;
		}
		
		//System.out.println(toplam);	
		
		if(toplam == sayi)
			System.out.println(sayi + " bir Armstrong sayidir.");
		else
			System.out.println(sayi + " Armstrong sayisi degildir.");
	}
}
