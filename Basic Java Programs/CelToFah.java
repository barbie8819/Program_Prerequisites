import java.util.Scanner;

public class CelToFah {
    public static void main(String[] args) {
        System.out.println("Enter Temperature in Celsius");
        Scanner scanner = new Scanner(System.in);
        double Cel = scanner.nextDouble();
double Fahrenheit = (Cel * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is equal to " + Fahrenheit);

    }
}