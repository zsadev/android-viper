package cz.helmisek.android.androidvipersample.core.interactor.repository;

public interface LocationRepository
{
	String PREF_KEY_LAST_WEATHER_LOCATION = "last_weather_location";
	String DEFAULT_LAST_WEATHER_LOCATION_VALUE = "London";

	String getLastLocation();
	void setLastLocation(final String location);
}