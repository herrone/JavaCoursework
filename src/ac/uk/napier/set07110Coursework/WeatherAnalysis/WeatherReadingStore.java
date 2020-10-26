//package ac.uk.napier.set07110Coursework.WeatherAnalysis;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import weather.WeatherData;
//
//public class WeatherReadingStore {
//
//	private ArrayList<WeatherReading> weatherReadings;
//	public WeatherReadingStore() {
//		this.weatherReadings = this.initialise();
//	}
//	public ArrayList<WeatherReading> initialise() {
//		
//		String[] weatherReadingTemp = WeatherData.getData();
//
//		for (String reading : weatherReadingTemp) {
//			String[] weatherReadingValued = reading.split(",");
//			int ident = Integer.parseInt(weatherReadingValued[0]);
//			String nameOfPlace = weatherReadingValued[1];
//			double longi = Double.parseDouble(weatherReadingValued[2]);
//			double lati = Double.parseDouble(weatherReadingValued[3]);
//			int year = Integer.parseInt(weatherReadingValued[4]);
//			int month = Integer.parseInt(weatherReadingValued[5]);
//			int date = Integer.parseInt(weatherReadingValued[6]);
//			int hour = Integer.parseInt(weatherReadingValued[7]);
//			double windSpeed = Double.parseDouble(weatherReadingValued[8]);
//			double temp = Double.parseDouble(weatherReadingValued[9]);
//
//
//
//			WeatherReading weatherReading = new WeatherReading(ident,nameOfPlace,longi,lati,year,month,date,hour,windSpeed,temp);
//		
//			
//		}
//		return this.weatherReadings;
//		
//		}
//		
//		public WeatherReading getByMinWindSpeed(double min) throws Exception{
//			for (WeatherReading reading : this.weatherReadings){
//			        if (min < reading.windSpeed){
//			            return reading;
//			        }
//			
//			
//		}
//		throw new Exception("Not found");
//
//	
//}
//		}

