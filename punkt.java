public class punkt {
private int masa;
// konstruktory
public punkt()
{
	this.masa=1;
}
public punkt(int masa)
{
	setMasa(masa);
}
// akcesory
public void setMasa(int masa)
{
	if(masa>0)
	{
		this.masa = masa;
		return;
	}
	else 
	{
		System.out.println("Masa nie moze byc ujemna");
		this.masa = 1;
	}
}
public int getmasa()
{
	return masa;
}
public int masa2(int i)
{
	masa = i;
	return masa;
}
//metoda bez parametrow, obliczajaca glowny moment bezwladnosci
public double momBez()
{
	int j=0;
	return j;
}
//metoda przyjmujaca jeden parametr, obliczajaca moment bezwladnosci z tw. Steinera
public double Stei(int k)
{
	double s;
	s=momBez()+masa*k*k;
	return s; 
}
// metoda zwracajaca staly opis obiektu "punkt materialny"
public void opis()
{
	System.out.println("Punkt materialny");
}
}
