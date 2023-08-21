package com.obsqura.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	
	public static Properties GetProperties() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Sask\\Code\\workspace\\ObsquraTestAutomationFramework\\src\\main\\resources\\Configurations\\Config.properties");
		prop.load(fis);
		return prop;
	}
}
