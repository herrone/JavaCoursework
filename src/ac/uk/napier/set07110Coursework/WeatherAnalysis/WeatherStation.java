package ac.uk.napier.set07110Coursework.WeatherAnalysis;

import org.openstreetmap.gui.jmapviewer.Coordinate;

//TODO: make fields private and add getters
public class WeatherStation extends Coordinate{
	
	public String siteName;
	public int siteId;
	
	
	public WeatherStation(int siteId, String siteName, double lat, double lon ) {

		super(lat, lon); 
		this.siteId = siteId;
		this.siteName = siteName;

	}
	
	public String toString() {
		return String.format("Weather Station: %s, %s", this.siteId, this.siteName);
	}
}
