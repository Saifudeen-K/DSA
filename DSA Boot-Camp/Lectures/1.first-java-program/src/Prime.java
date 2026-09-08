import java.util.Scanner;

public class Prime {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Nimber: ");
        int n = sc.nextInt();

        if (n < 1){
            System.out.println("Neither Prime nor Composite!");
            return;
        }

        int c = 2;
        while (c * c <= n){
            if(n % c == 0){
                System.out.println("Not Prime!");
                return;
            }
            c++;
        }
        if (c * c > n){
            System.out.println("Prime!");
        }
    }
}
