package studia;

public class testowy {

	public static void main(String[] args) {
		walec walec1=new walec(10);//tworzymy nowy obiekt walec1
		kula kula1 = new kula();//tworzymy nowy obiekt kula1
		pr�t pr�t1 = new pr�t();//tworzymy nowy obiekt pr�t1
		
		walec1.setmasa(10);//Ustawiamy mase
		kula1.setmasa(5);
		pr�t1.setmasa(2);
		
		System.out.println("Masa "+walec1.opis_obiektu()+ " wynosi : "+ walec1.getmasa()+" jego moment bezw�adno�ci wynosi :" +
		 walec1.moment_bezw�adno�ci()+" a moment wyliczony z tw.Steinera " +walec1.steiner(5));
		System.out.println("Masa"+kula1.opis_obiektu()+ " wynosi : "+ kula1.getmasa()+" jej moment bezw�adno�ci wynosi :" +
				 kula1.moment_bezw�adno�ci()+" a moment wyliczony z tw.Steinera " +kula1.steiner(10));
		System.out.println("Masa"+pr�t1.opis_obiektu()+ " wynosi : "+ pr�t1.getmasa()+" jego moment bezw�adno�ci wynosi :" +
				 pr�t1.moment_bezw�adno�ci()+" a moment wyliczony z tw.Steinera "+ pr�t1.steiner(2));
	
		punktmat [] tablica = new punktmat [3];
		tablica[0]=walec1;
		tablica[1]=kula1;
		tablica[2]=pr�t1;
		for(int i=0 ; i<tablica.length ; i++)
		{
			System.out.println("Masa " + tablica[i].opis_obiektu() +" wynosi "+tablica[i].getmasa() );
			System.out.println(" Jego moment g��wny wynosi : " + tablica[i].moment_bezw�adno�ci() );
			System.out.println(" A jego momenty wyliczone z tw.Steinera wynosz� : " + tablica[i].steiner(5) );
		}
	
		
	}
		
	
	
	
}
