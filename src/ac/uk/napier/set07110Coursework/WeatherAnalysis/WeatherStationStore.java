package ac.uk.napier.set07110Coursework.WeatherAnalysis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import weather.WeatherData;
//TODO:make stuff private + change exception string 

public class WeatherStationStore {
	
	private ArrayList<WeatherStation> weatherStations;
	public WeatherStationStore() {
		this.weatherStations = this.initialise();
	}

	private ArrayList<WeatherStation> initialise() {
		
		HashMap<Integer , WeatherStation> weatherStations = new HashMap<Integer, WeatherStation>();
		String[] weatherReadingData = WeatherData.getData();
		weatherReadingData = Arrays.copyOfRange(weatherReadingData, 1, weatherReadingData.length);
		
		for (String reading : weatherReadingData) {
			String[] weatherReadingValues = reading.split(",");
			int siteId = Integer.parseInt(weatherReadingValues[0]);
			String siteName = weatherReadingValues[1];
			double lat = Double.parseDouble(weatherReadingValues[2]);
			double lon = Double.parseDouble(weatherReadingValues[3]);

			WeatherStation weatherStation = new WeatherStation(siteId, siteName, lat ,lon);
			
			weatherStations.put(siteId, weatherStation);
			
		}
		
		return new ArrayList<WeatherStation>(weatherStations.values());
		
	}
	
	public ArrayList<WeatherStation> getAll() {
		return this.weatherStations;
	}
	public WeatherStation getByName(String wantedName) throws Exception{
		for (WeatherStation station : this.weatherStations){
		        if (wantedName.equals(station.siteName)){
		            return station;
		        }
		
		
	}
		throw new Exception("FUCK YOU BISH");

}
}
