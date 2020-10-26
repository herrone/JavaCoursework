package ac.uk.napier.set07110Coursework.WeatherAnalysis;

import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import weather.WeatherData;

public class PostcodeStore {

	ArrayList<Postcode> postcodes;
	public PostcodeStore() {
		this.postcodes = this.initialise();
	}

	private ArrayList<Postcode> initialise() {
		ArrayList<Postcode> postcodes = new ArrayList<Postcode>();
		String[] postcodeData = PostcodeData.getData();



		for (String postie:postcodeData) {
			String[] postcodeValues = postie.split(",");
			String place = postcodeValues[0];
			double lat = Double.parseDouble(postcodeValues[1]);
			double lon = Double.parseDouble(postcodeValues[2]);

			Postcode postcode = new Postcode(lat, lon, place);
			//		
			postcodes.add(postcode);

		}
		return postcodes;
	}
	
	public ArrayList<Postcode> getWithin(double lat, double lon, double distanceKm){
		
		ArrayList <Postcode> nearbyPostcodes = new ArrayList <Postcode>();
	
		for (Postcode postcode: this.postcodes) {
			if(WeatherData.getDistanceBetweenPoints(lat,lon,postcode.getLat(), postcode.getLon()) < distanceKm){
				nearbyPostcodes.add(postcode);
			}
		}
		return nearbyPostcodes;
	}
	public ArrayList<Postcode> getAll(){
		
		return this.postcodes;
	}
	
}
