import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Listeler liste = new Listeler();
		
		int secim = -1;
			while(secim != 0){
			
			System.out.println(" 1 - Ba�a ekle");
			System.out.println(" 2 - Sona Ekle");
			System.out.println(" 3 - Araya Ekle");
			System.out.println(" 4 - ba�tan sil ");
			System.out.println(" 5 - sondan sil ");
			System.out.println(" 6 - aradan sil ");
			System.out.println(" 7 - Tersten Yazd�r");
			System.out.println(" 0 - ��k��");
			System.out.println("Se�iminiz: ");
			
			secim = scan.nextInt();
			scan.nextLine();
			
			
			switch (secim) {
			
			case 1: liste.BasaEkle(); break;
			case 2: liste.SonaEkle(); break;
			case 3: liste.ArayaEkle(); break;
			case 4: liste.bastansil(); break;
			case 5: liste.sondansil(); break;
			case 6: liste.aradansil(); break;
			case 7: liste.TerstenYazdir(); break;
			case 0: System.out.println("��k�� yap�ld�."); break;
			default: System.out.println("hatal� se�im");
			}
			liste.yazdir();
		}
	}

}
