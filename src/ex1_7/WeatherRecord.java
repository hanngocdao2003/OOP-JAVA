package ex1_7;

public class WeatherRecord {
	Date date;
	TemperatureRange today;
	TemperatureRange normal;
	TemperatureRange record;
	double precipitation;

	public WeatherRecord(Date date, TemperatureRange today, TemperatureRange normal, TemperatureRange record,
			double precipitation) {
		super();
		this.date = date;
		this.today = today;
		this.normal = normal;
		this.record = record;
		this.precipitation = precipitation;
	}

}
