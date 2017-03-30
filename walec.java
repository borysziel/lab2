package studia;

public class walec extends punktmat{
	private float promieñ;
	
	public  walec(float r)
	{
		super();
		r= promieñ ;
		
		
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
		return "walec";
	}
}
