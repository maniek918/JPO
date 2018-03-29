import java.util.ArrayList;
public class program_testowy {

	public static void main(String[] args) 
	{
		// obiekt klasy z konstruktorem domyslnym
		punkt pkt1 = new punkt();
		System.out.println("Opis punktu 1: ");
		pkt1.punktm();
		System.out.println("Masa punktu 1: " +pkt1.getmasa());
		System.out.println("Glowny moment bezwladnosci punktu 1: "+pkt1.glMom());
		System.out.println("Moment bezwladnosci z tw. Steinera punktu 1: "+pkt1.Stei(3));
		//obiekt klasy z konstruktorem z parametrami
		punkt pkt2 = new punkt(15);  
		System.out.println("Opis punktu 2: ");
		pkt2.punktm();
		System.out.println("Masa punktu 2: "+pkt2.getmasa());
		System.out.println("Glowny moment bezwladnosci punktu 2: "+pkt2.glMom());
		System.out.println("Moment bezwladnosci z tw. Steinera pkt2: "+pkt2.Stei(4));
		//zmiana masy pierwszego obiektu
		pkt1.masa2(10); 
		System.out.println("Opis punktu 1 ze zmieniona masa: ");
		pkt1.punktm();
		System.out.println("Masa punktu 1 ze zmieniona masa: "+pkt1.getmasa());
		System.out.println("Glowny moment bezwladnosci punktu 1 ze zmieniona masa:  "+pkt1.glMom());
		System.out.println("Moment bezwladnosci z tw. Steinera punktu 1 ze zmieniona masa: "+pkt1.Stei(3));
		// stworzenie tablicy obiektow i zainicjowanie ich z wykorzystaniem petli
		ArrayList<punkt> tablica_pkt = new ArrayList<punkt>();
		ArrayList<Integer> tablica_mas = new ArrayList<Integer>();
		int l_pkt=5;
		tablica_mas.add(10);
		tablica_mas.add(15);
		tablica_mas.add(20);
		tablica_mas.add(25);
		tablica_mas.add(30);
		
		for(int p=0;p<l_pkt;p++) 
		{
		punkt punkt = new punkt(tablica_mas.get(p));
		tablica_pkt.add(punkt);
		}
		for(int p=0;p<l_pkt;p++) 
		{
			punkt punkt = tablica_pkt.get(p);
			System.out.println("Opis: ");
			pkt1.punktm();
			System.out.println("Masa: "+punkt.getmasa());
			System.out.println("Glowny moment bezwaldnosci:  "+punkt.glMom());
			System.out.println("Moment bezwaldnosci z tw. Steinera: "+punkt.Stei(5));
			}
	}

}
