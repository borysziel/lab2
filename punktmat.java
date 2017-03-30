package studia;

public class punktmat {
	
	private float masa;

	
	public float getmasa()//akcesor pobieraj¹cy masê
	{
		return masa;
	}
	public void setmasa(float m)//akcesor ustawiaj¹cy mase
	{
		 masa= m ;
		
	}
	
	public float steiner(float r)
	{
		return moment_bezw³adnoœci()*masa*r*r;
	}
	public float moment_bezw³adnoœci() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String opis_obiektu() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
