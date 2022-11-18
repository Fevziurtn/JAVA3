package youtubeAbstractClass;

public class Main {

	public static void main(String[] args) {
		//abstractlar'da bir sınıftır.
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		womenGameCalculator.hesapla();
		
		GameCalculator gameCalculators = new WomenGameCalculator(); 
	}

}
