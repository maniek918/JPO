public class punkt {
private int masa;
// konstruktory
public punkt()
{
	masa=1;
}
public punkt(int m)
{
	if(m>0)
	{
		masa=m;
	}
	else 
	{
		System.out.println("Masa nie moze byc ujemna");
	}
}
// akcesory
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
public int glMom()
{
	int j=0;
	return j;
}
//metoda przyjmujaca jeden parametr, obliczajaca moment bezwladnosci z tw. Steinera
public int Stei(int k)
{
	int s;
	s=glMom()+masa*k*k;
	return s; 
}
// metoda zwracajaca staly opis obiektu "punkt materialny"
public void punktm()
{
	System.out.println("Punkt materialny");
}
}
