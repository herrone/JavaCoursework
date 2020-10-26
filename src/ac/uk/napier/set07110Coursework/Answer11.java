package ac.uk.napier.set07110Coursework;
import java.util.ArrayList;

import ac.uk.napier.set07110Coursework.WeatherAnalysis.Postcode;
import ac.uk.napier.set07110Coursework.WeatherAnalysis.PostcodeData;
import ac.uk.napier.set07110Coursework.WeatherAnalysis.PostcodeStore;
import ac.uk.napier.set07110Coursework.WeatherAnalysis.WeatherStation;
import ac.uk.napier.set07110Coursework.WeatherAnalysis.WeatherStationStore;

public class Answer11 {
	public static void main(String[] args) {
		System.out.println("Question 11");
		WeatherStationStore weatherStationStore = new WeatherStationStore();
		
		ArrayList<Postcode> postcodes = initialisePostcodes();
		PostcodeStore postcodeStore = new PostcodeStore(postcodes);
		try {
			WeatherStation inverbervie = weatherStationStore.getByName("INVERBERVIE (3088)");
			ArrayList<Postcode> nearbyPostcodes = postcodeStore.getWithin(inverbervie.getLat(), inverbervie.getLon(), 5);
			System.out.println(nearbyPostcodes.size());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	private static ArrayList<Postcode> initialisePostcodes() {
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
}