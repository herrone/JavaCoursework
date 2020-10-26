package ac.uk.napier.set07110Coursework.WeatherAnalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PostcodeData{
	
	public static String[] getData() { 
		
		ArrayList<String> postcodesTemp = new ArrayList<String>();
	
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("data/postcodes.csv")));
			String currentLine; 
			
			while((currentLine = reader.readLine())!= null) {
				postcodesTemp.add(currentLine);
			}
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (NumberFormatException e) {			
			e.printStackTrace();
		}

		return postcodesTemp.toArray(new String[] {});
	} 

}
