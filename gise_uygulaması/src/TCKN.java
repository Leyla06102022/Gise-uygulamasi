import java.util.Random;

public class TCKN {

	private long id;

	private String dogumyeri;

	private String tckn;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDogumyeri() {
		return dogumyeri;
	}

	public void setDogumyeri(String dogumyeri) {
		this.dogumyeri = dogumyeri;
	}

	public String getTckn() {
		return tckn;
	}

	boolean kontrol = true;

	public void setTckn(String tckn) {
		if (tckn.length() == 11) {
			for (int i = 0; i < tckn.length(); i++) {
				char karakter = tckn.charAt(i);
				if (Character.isDigit(karakter)) {
					kontrol = true;
				} else {
					kontrol = false;
					break;
				}
			}
			if (kontrol) {
				Random random = new Random();
				int giseNo = random.nextInt(100);

				sonucuYazdir("GISE NO : " + giseNo);
			} else {
				sonucuYazdir("Lutfen butun karakterleri rakam olarak giriniz!");
			}

		}

		else {
			sonucuYazdir("TC 11 karakter olmak zorundadir!");
		}
		this.tckn = tckn;
	}

	public void sonucuYazdir(String sonuc) {
		System.out.println(sonuc);
	}

}
