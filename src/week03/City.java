package week03;

public class City {
	private String cityName;
	private int population;
	private double growthRate;
	
	public City(int population, double growthRate, String cityName) {
		this.population = population;
		this.growthRate = growthRate;
		this.cityName = cityName;
	}
	
	public int computeFuturePopulation(int years) {
		double populationAmount = this.getPopulation();
		for(int i=0; i<years; i++) {
			populationAmount += populationAmount*this.getGrowthRate()*0.01;
		}
		
		return (int)populationAmount;
	}
	

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCityName() {
		return cityName;
	}
	public int getPopulation() {
		return population;
	}
	public double getGrowthRate() {
		return growthRate;
	}

}