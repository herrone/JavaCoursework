package ac.uk.napier.set07110Coursework;
import java.util.ArrayList;

import ac.uk.napier.set07110Coursework.WeatherAnalysis.Postcode;
import ac.uk.napier.set07110Coursework.WeatherAnalysis.PostcodeStore;
import ac.uk.napier.set07110Coursework.WeatherAnalysis.WeatherStation;
import ac.uk.napier.set07110Coursework.WeatherAnalysis.WeatherStationStore;

public class Answer11 {
	public static void main(String[] args) {
		System.out.println("Question 11");
		WeatherStationStore weatherStationStore = new WeatherStationStore();
		PostcodeStore postcodeStore = new PostcodeStore();
		try {
			WeatherStation inverbervie = weatherStationStore.getByName("INVERBERVIE (3088)");
			ArrayList<Postcode> nearbyPostcodes = postcodeStore.getWithin(inverbervie.getLat(), inverbervie.getLon(), 5);
			System.out.println(nearbyPostcodes.size());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}