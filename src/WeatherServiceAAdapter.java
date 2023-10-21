class WeatherServiceAAdapter implements WeatherService {
    private final WeatherServiceA serviceA;

    public WeatherServiceAAdapter(WeatherServiceA serviceA) {
        this.serviceA = serviceA;
    }

    @Override
    public double getTemperature() {
        String temperatureString = serviceA.getTemperature();
        return Double.parseDouble(temperatureString);
    }

    @Override
    public String getConditions() {
        return serviceA.getConditions();
    }
}
