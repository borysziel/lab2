package studia;

public class pr�t extends punktmat{
private float d�ugo��_pr�ta; // zmienna d�ugo�� pr�ta
	
	public  pr�t()//nadanie wartosci dla promienia podstawy
	{
		super();
		d�ugo��_pr�ta = 10;
		
	}
	public float moment_bezw�adno�ci ()//prze�adowanie zmiennej 
	{	
		return getmasa()*d�ugo��_pr�ta*d�ugo��_pr�ta/2;
	}
	public float steiner(float r)
	{
		return moment_bezw�adno�ci()+getmasa()*r*r;
	}
	public String opis_obiektu()//opis obiektu
	{
		return "pr�t";
	}
	
}
