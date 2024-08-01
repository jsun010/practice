import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original temperature unit: " );
        String temperature = scanner.nextLine();
        System.out.print("What is the temperature you want converted? (Enter a number): ");
        double tempDouble= scanner.nextDouble();
        scanner.nextLine();
        System.out.print("What is the temperature you want converted to?");
        String temperatureConverted = scanner.nextLine();
        System.out.println("Input ready");

        HashSet<String> celsiusSet = new HashSet<>();
        celsiusSet.add("C");
        celsiusSet.add("Celsius");
        celsiusSet.add("celsius");
        celsiusSet.add("c");

        HashSet<String> fahrenheitSet = new HashSet<>();
        fahrenheitSet.add("F");
        fahrenheitSet.add("Farenheit");
        fahrenheitSet.add("fahrenheit");
        fahrenheitSet.add("f");

        HashSet<String> kelvinSet = new HashSet<>();
        kelvinSet.add("K");
        kelvinSet.add("Kelvin");
        kelvinSet.add("k");
        kelvinSet.add("kelvin");

        if ((!celsiusSet.contains(temperature)&&!fahrenheitSet.contains(temperature)&&!kelvinSet.contains(temperature)||(!celsiusSet.contains(temperatureConverted)&&!fahrenheitSet.contains(temperatureConverted)&&!kelvinSet.contains(temperatureConverted))) ){
            System.out.println("Invalid input");

        }

        if (celsiusSet.contains(temperature) && fahrenheitSet.contains(temperatureConverted)){
            System.out.println("The temperature you want converted is: " + TempConvert.celsiusToFahrenheit(tempDouble));
        }
        if (celsiusSet.contains(temperature) && kelvinSet.contains(temperatureConverted)){
            System.out.println("The temperature you want converted is: " + TempConvert.celsiusToKelvin(tempDouble));
        }
        if (fahrenheitSet.contains(temperature) && celsiusSet.contains(temperatureConverted)){
            System.out.println("The temperature you want converted is: " + TempConvert.fahrenheitToCelsius(tempDouble));
        }
        if (fahrenheitSet.contains(temperature) && kelvinSet.contains(temperatureConverted)){
            System.out.println("The temperature you want converted is: " + TempConvert.fahrenheitToKelvin(tempDouble));
        }
        if (kelvinSet.contains(temperature) && celsiusSet.contains(temperatureConverted)){
            System.out.println("The temperature you want converted is: " + TempConvert.kelvinToCelsius(tempDouble));
        }
        if (kelvinSet.contains(temperature) && fahrenheitSet.contains(temperatureConverted)){
            System.out.println("The temperature you want converted is: " + TempConvert.kelvinToFahrenheit(tempDouble));
        }
        if (celsiusSet.contains(temperature) && celsiusSet.contains(temperatureConverted)){
            System.out.println(tempDouble);
        }
        if (fahrenheitSet.contains(temperature) && fahrenheitSet.contains(temperatureConverted)){
            System.out.println(tempDouble);
        }
        if (kelvinSet.contains(temperature) && kelvinSet.contains(temperatureConverted)){
            System.out.println(tempDouble);
        }
    }

}