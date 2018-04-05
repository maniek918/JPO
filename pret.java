
public class pret extends punkt{
	private int dlugosc;
	// konstruktory
	public pret()
	{
		super();
		this.setDlugosc(1);
	}
	public pret(int l, int m)
	{
		super(m);
		this.setDlugosc(l);
	}
	// akcesory
	public int getDlugosc()
	{
		return this.dlugosc;
	}
	public void setDlugosc(int l)
	{
	if(l>0)
	{
		this.dlugosc = l;
		return;
	}
	else 
	{
		System.out.println("Podano ujemna dlugosc, promien ustawiono na 1 ");
		this.dlugosc = 1;
	}
	}
	// metody
	public double momBez()
	{
		return (this.getmasa()*this.getDlugosc()*this.getDlugosc())/12;
	}
	public void opis ()
	{
		System.out.println("Pret");
		System.out.println("masa: " + this.getmasa());
		System.out.println("promien: " + this.getDlugosc());
		System.out.println("moment bezwladnosci: " + this.momBez());
	}

	}


