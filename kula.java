
public class kula extends punkt{
	private int promien;
	// konstruktory
	public kula()
	{
		super();
		this.setPromien(1);
	}
	public kula(int r, int m)
	{
		super(m);
		this.setPromien(r);
	}
	// akcesory
	public int getPromien()
	{
		return this.promien;
	}
	public void setPromien(int r)
	{
	if(r>0)
	{
		this.promien = r;
		return;
	}
	else 
	{
		System.out.println("Podano ujemny promien, promien ustawiono na 1 ");
		this.promien = 1;
	}
	}
	// metody
	public double momBez()
	{
		return 0.4*this.getmasa()*this.getPromien()*this.getPromien();
	}
	public void opis ()
	{
		System.out.println("Kula");
		System.out.println("masa: " + this.getmasa());
		System.out.println("promien: " + this.getPromien());
		System.out.println("moment bezwladnosci: " + this.momBez());
	}
}
