package ac.uk.napier.set07110Coursework.WeatherAnalysis;

import java.util.ArrayList;

import org.openstreetmap.gui.jmapviewer.Coordinate;

import weather.WeatherData;

public class PostcodeStore {

	ArrayList<Postcode> postcodes;
	public PostcodeStore(ArrayList<Postcode> postcodes) {
		this.postcodes = postcodes;
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
