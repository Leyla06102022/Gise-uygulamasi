
import java.util.Random;
import java.util.Scanner;

public class AnaSinif {

	public static void main(String[] args) {
		//Gişe uygulaması yapalım tc si doğru ise numara versin yanlış girerse uyarsın.
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Gise uygulamasina hosgeldiniz");
		System.out.print("Lutfen TCKN giriniz : ");
		
		String tckn=scanner.nextLine();
		
		TCKN tcknNesne = new TCKN();
		tcknNesne.setTckn(tckn);
		
		// RANDOM---rastgele deger üretmek için.

	}

}
