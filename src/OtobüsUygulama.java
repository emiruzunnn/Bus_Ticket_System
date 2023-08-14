import java.awt.image.AbstractMultiResolutionImage;
import java.util.Scanner;

public class OtobüsUygulama {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Gideceginiz Mesafe Kac Km?: ");
		double mesafe = scanner.nextDouble();
		System.out.print("Yasinizi Giriniz: ");
		double yas = scanner.nextDouble();
		System.out.println("Yolculuk Tipinizi Seciniz: Tek Yon => 1  Gidis Donus => 2");
		int tip = scanner.nextInt();
		
		if (mesafe>0 && yas > 0 && (tip == 1 || tip == 2)) {
			
				double biletfiyati = mesafe * 0.10;
				double yasIndirimlifiyati = 0;
				double yasIndirimOrani = 0;
				double tipsecimi = 0;
				
				if (yas < 12) {
					yasIndirimOrani = 0.5;
				}else if (12 <= yas && yas <= 24) {
					yasIndirimOrani = 0.10;
				}else if (yas > 65) {
					yasIndirimOrani = 0.30;
				}
				
				yasIndirimlifiyati = biletfiyati * yasIndirimOrani;
				double biletindirimlifiyat = biletfiyati - yasIndirimlifiyati;
				
				if (tip == 2) {
					tipsecimi = biletindirimlifiyat * 0.20;
					biletindirimlifiyat -= tipsecimi;
					biletindirimlifiyat *= 2;
				} 
				
				System.out.println("Bilet Ucretiniz: " + biletindirimlifiyat + "TL");
				
				
			
		}else {
			System.out.println("Yanlis Veri Girildi!");
		}
		
		scanner.close();
		

		
		
		
	}

}
