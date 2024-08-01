public class TempConvert {

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32)/1.8;
    }
    public static double celsiusToKelvin(double celsius) {
        return celsius+273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin-273.15;
    }
    public static double fahrenheitToKelvin(double fahrenheit) {
        return fahrenheitToCelsius(fahrenheit)+273.15;
    }
    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }
}
