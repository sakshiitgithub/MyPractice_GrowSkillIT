package Utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import ConstantsData.ConstantsData;

public class FetchDataFromProperty {
	
	public static Properties readDataFromProperty() throws IOException
	{
		FileReader reader = new FileReader(ConstantsData.PropFilePath);
		Properties prop = new Properties();
		prop.load(reader);
		return(prop);
	}

}
