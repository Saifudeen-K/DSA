import java.util.Scanner;

public class Sum {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float num1 = in.nextFloat();

        System.out.println("Enter second number: ");
        float num2 = in.nextFloat();

        float sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}
