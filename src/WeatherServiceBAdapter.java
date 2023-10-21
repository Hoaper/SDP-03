class WeatherServiceBAdapter implements WeatherService {
    private final WeatherServiceB serviceB;

    public WeatherServiceBAdapter(WeatherServiceB serviceB) {
        this.serviceB = serviceB;
    }

    @Override
    public double getTemperature() {
        return serviceB.getDegrees();
    }

    @Override
    public String getConditions() {
        return serviceB.getWeatherConditions();
    }
}
