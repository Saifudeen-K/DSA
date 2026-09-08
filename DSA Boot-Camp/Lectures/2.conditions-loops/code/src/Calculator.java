import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Take input from user till user does not press x or X
        int ans = 0;

        while (true){
            System.out.println("Enter the Operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                // input two numbers
                System.out.println("Enter First Number: ");
                int num1 = sc.nextInt();

                System.out.println("Enter Second Number: ");
                int num2 = sc.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 - num2;
                }
                if (op == '*'){
                    ans = num1 * num2;
                }
                if (op == '/'){
                    ans = num1 / num2;
                }
                if (op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X'){
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
