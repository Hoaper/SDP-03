
class SomeWeatherServiceA implements WeatherServiceA {
    @Override
    public String getTemperature() {
        return "25.5";
    }

    @Override
    public String getConditions() {
        return "Sunny";
    }
}

