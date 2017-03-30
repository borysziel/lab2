package studia;

public class prêt extends punktmat{
private float d³ugoœæ_prêta; // zmienna d³ugoœæ prêta
	
	public  prêt()//nadanie wartosci dla promienia podstawy
	{
		super();
		d³ugoœæ_prêta = 10;
		
	}
	public float moment_bezw³adnoœci ()//prze³adowanie zmiennej 
	{	
		return getmasa()*d³ugoœæ_prêta*d³ugoœæ_prêta/2;
	}
	public float steiner(float r)
	{
		return moment_bezw³adnoœci()+getmasa()*r*r;
	}
	public String opis_obiektu()//opis obiektu
	{
		return "prêt";
	}
	
}
