public class WeatherApp {
    public static void main(String[] args) {
        WeatherServiceA serviceA = new SomeWeatherServiceA();
        WeatherService adapterA = new WeatherServiceAAdapter(serviceA);
        displayWeather(adapterA);

        WeatherServiceB serviceB = new SomeWeatherServiceB();
        WeatherService adapterB = new WeatherServiceBAdapter(serviceB);
        displayWeather(adapterB);
    }

    private static void displayWeather(WeatherService weatherService) {
        System.out.println("Temperature: " + weatherService.getTemperature());
        System.out.println("Conditions: " + weatherService.getConditions());
    }
}
