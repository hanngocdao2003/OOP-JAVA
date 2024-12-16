package ex1_7;

import junit.framework.TestCase;

public class WeatherRecordTest extends TestCase {

	public void testConstructor() {
		Date d1 = new Date(13, 10, 2024);
		Date d2 = new Date(14, 10, 2024);
		Date d3 = new Date(15, 10, 2024);
		
		new WeatherRecord(d1, new TemperatureRange(28, 34), new TemperatureRange(26, 32), new TemperatureRange(29, 36), 2.55);
		new WeatherRecord(d2, new TemperatureRange(27, 35), new TemperatureRange(26, 32), new TemperatureRange(30, 38), 20.0);
		new WeatherRecord(d3, new TemperatureRange(24, 31), new TemperatureRange(26, 32), new TemperatureRange(30, 35), 33.4);
	}

}
