import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Distance in Km: ");
        double num1 = scanner.nextDouble();

       

        double miles = num1*0.621371;

        System.out.println("The distance in miles : " + miles);

        scanner.close();
    }
}
