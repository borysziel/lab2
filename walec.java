package studia;

public class walec extends punktmat{
	private float promie�;
	
	public  walec(float r)
	{
		super();
		r= promie� ;
		
		
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
		return "walec";
	}
}
