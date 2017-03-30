package studia;

public class kula extends punktmat{
private float promieñ;
	
	public  kula()
	{
		super();
		promieñ = 10;
		
	}
	public float moment_bezw³adnoœci ()
	{
		return getmasa()*promieñ*promieñ/2;
	}
	public float steiner(float r)
	{
		return moment_bezw³adnoœci()+getmasa()*r*r;
	}
	public String opis_obiektu()
	{
		return "kula";
	}
}
