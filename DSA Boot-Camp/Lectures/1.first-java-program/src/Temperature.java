import java.util.Scanner;

public class Temperature {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature in Celsius: ");
        float tempC = sc.nextFloat();

        float tempF = (tempC * 9/2) + 32;

        System.out.println("Temperature: " + tempF);

    }
}
