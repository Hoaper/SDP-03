class SomeWeatherServiceB implements WeatherServiceB {
    @Override
    public double getDegrees() {
        return 20.0;
    }

    @Override
    public String getWeatherConditions() {
        return "Cloudy";
    }
}
