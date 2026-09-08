import java.util.Scanner;

public class Inputs {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter roll number: ");
        int roll_no = sc.nextInt();
        System.out.println("Your Roll_no is: " + roll_no);

        System.out.println("enter your name: ");
        String name = sc.next();
        System.out.println("Name: " + name);

        System.out.println("enter your marks: ");
        float marks = sc.nextFloat();
        System.out.println("marks: " + marks);
    }
}
