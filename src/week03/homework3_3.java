package week03;

public class homework3_3 {
	public static void main(String[] args) {
	    City aCity = new City(500000, 1.5, "Ansan");
	    int newPopulation;
	    int years = 10;
	    newPopulation = aCity.computeFuturePopulation(years);
	    
	    
	    
	    System.out.println(newPopulation);
	}
}
