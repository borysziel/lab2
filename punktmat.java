package studia;

public class punktmat {
	
	private float masa;

	
	public float getmasa()//akcesor pobieraj�cy mas�
	{
		return masa;
	}
	public void setmasa(float m)//akcesor ustawiaj�cy mase
	{
		 masa= m ;
		
	}
	
	public float steiner(float r)
	{
		return moment_bezw�adno�ci()*masa*r*r;
	}
	public float moment_bezw�adno�ci() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String opis_obiektu() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
