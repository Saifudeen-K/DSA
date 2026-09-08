import java.util.Scanner;

public class StringExample {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String naam = sc.next();
        String personalised = Greet(naam);
        System.out.println(personalised);

    }

    static String Greet(String name){
        String message = "Hello " +  name;
        return message;
    }

    static String greet(){
        String greeting = "How Are You?";
        return greeting;
    }
}
