package ac.uk.napier.set07110Coursework.WeatherAnalysis;

import org.openstreetmap.gui.jmapviewer.Coordinate;

//TODO: make name private and add getter
public class Postcode extends Coordinate{
	public String name;
	
	public Postcode(double lat, double lon, String code) {

		super(lat, lon); 
		name = code;  

	}
	
	public String toString() {
		return String.format("Postcode: %s" , this.name);
	}

}
