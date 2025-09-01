package classWork;
import java.util.Scanner;

public class BridgeLabz3 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");

        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.printf("The temperature in Fahrenheit is: %.2f%n", fahrenheit);

        sc.close();
    }
}
