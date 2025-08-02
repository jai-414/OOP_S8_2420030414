package lab_1;
import java.util.Scanner;

public class Fahrenheit_to_celsius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}


