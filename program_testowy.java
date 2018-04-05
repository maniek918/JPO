public class program_testowy {

	public static void main(String[] args) 
	{
	 walec w1 = new walec(5, 12);
	 kula k1 = new kula(6, 16);
     pret pr1 = new pret(9, 12);
     w1.opis();
     k1.opis();
	 pr1.opis();
    punkt tab[] = new punkt[9];
	 System.out.println("\nPETLE:\n");
	 for(int x = 0; x <9 ; x = x+3)
	{
		 tab[x] = new walec((x+1)*2 , (x+1)*10);
		 tab[x+1] = new kula((x+1)+10 , (x+1)*2);
		 tab[x+2] = new pret((x+1)*3,(x+1)+2);
		}
	  for(int x = 0; x <9 ; x++)
	{
      tab[x].opis();
      System.out.println("Moment bezwladnosci przesuniety o 4 jednostki: " + tab[x].Stei(4) + "\n");
		      }
		      }
	}

