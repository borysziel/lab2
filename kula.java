package studia;

public class kula extends punktmat{
private float promie�;
	
	public  kula()
	{
		super();
		promie� = 10;
		
	}
	public float moment_bezw�adno�ci ()
	{
		return getmasa()*promie�*promie�/2;
	}
	public float steiner(float r)
	{
		return moment_bezw�adno�ci()+getmasa()*r*r;
	}
	public String opis_obiektu()
	{
		return "kula";
	}
}
