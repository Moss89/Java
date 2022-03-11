package Tomas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// How cold is it outside? The temperature alone is not enough to provide the answer. Other factors
        //including wind speed, relative humidity, and sunshine play important roles in determining coldness
        //outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature
        //to measure the coldness using temperature and wind speed. The formula is:
        //twc = 35.74 + 0.6215ta − 35.75v^0.16 + 0.4275tav^0.16
        //where ta is the outside temperature measured in degrees Fahrenheit and v is the wind speed measured
        //in miles per hour. twc is the wind-chill temperature.

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        double temperature = myScanner.nextDouble();
        System.out.println("Enter the wind speed in miles per hour: ");
        double windSpeed = myScanner.nextDouble();

        System.out.println("The wind-chill temperature is: " + (35.74 + 0.6215*temperature - 35.75*Math.pow(windSpeed,0.16)
        + 0.4275*Math.pow(temperature*windSpeed,0.16)));
        myScanner.close();
    }
}
