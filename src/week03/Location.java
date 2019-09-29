package week03;

public class Location {
	private double latitude;
	private double longitude;
	
	public Location(double lat, double lon) {
		this.latitude = lat;
		this.longitude = lon;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return this.longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
//	R × arccos(cos(rad(90−lat1)) × cos(rad(90−lat2)) + sin(rad(90−lat1)) × sin(rad(90−lat2)) × cos(rad(lon1−lon2)))

	public double distance(Location other) {
		double RADIUS_EARTH = 6371.0;
		
		return RADIUS_EARTH * Math.acos( 
				Math.cos(Math.toRadians(90-this.latitude))
				* Math.cos(Math.toRadians(90-other.latitude))
				+ Math.sin(Math.toRadians(90-this.latitude))
				* Math.sin(Math.toRadians(90-other.latitude))
				* Math.cos(Math.toRadians(this.longitude-other.longitude))
			);
		
//		325.23184366269084
//		325.23184366270476
	}
}
