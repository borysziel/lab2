package studia;

public class testowy {

	public static void main(String[] args) {
		walec walec1=new walec(10);//tworzymy nowy obiekt walec1
		kula kula1 = new kula();//tworzymy nowy obiekt kula1
		prêt prêt1 = new prêt();//tworzymy nowy obiekt prêt1
		
		walec1.setmasa(10);//Ustawiamy mase
		kula1.setmasa(5);
		prêt1.setmasa(2);
		
		System.out.println("Masa "+walec1.opis_obiektu()+ " wynosi : "+ walec1.getmasa()+" jego moment bezw³adnoœci wynosi :" +
		 walec1.moment_bezw³adnoœci()+" a moment wyliczony z tw.Steinera " +walec1.steiner(5));
		System.out.println("Masa"+kula1.opis_obiektu()+ " wynosi : "+ kula1.getmasa()+" jej moment bezw³adnoœci wynosi :" +
				 kula1.moment_bezw³adnoœci()+" a moment wyliczony z tw.Steinera " +kula1.steiner(10));
		System.out.println("Masa"+prêt1.opis_obiektu()+ " wynosi : "+ prêt1.getmasa()+" jego moment bezw³adnoœci wynosi :" +
				 prêt1.moment_bezw³adnoœci()+" a moment wyliczony z tw.Steinera "+ prêt1.steiner(2));
	
		punktmat [] tablica = new punktmat [3];
		tablica[0]=walec1;
		tablica[1]=kula1;
		tablica[2]=prêt1;
		for(int i=0 ; i<tablica.length ; i++)
		{
			System.out.println("Masa " + tablica[i].opis_obiektu() +" wynosi "+tablica[i].getmasa() );
			System.out.println(" Jego moment g³ówny wynosi : " + tablica[i].moment_bezw³adnoœci() );
			System.out.println(" A jego momenty wyliczone z tw.Steinera wynosz¹ : " + tablica[i].steiner(5) );
		}
	
		
	}
		
	
	
	
}
