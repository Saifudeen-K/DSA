import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit){

            case "Mango" -> System.out.println("King of fruits");
            case  "Apple" -> System.out.println("A sweet red fruit");
            case  "Orange" -> System.out.println("Orange color fruit");
            case  "Grapes" -> System.out.println("Small sweet fruit");
            default -> System.out.println("Enter a valid option");

        }

        int day = sc.nextInt();
        switch (day){

            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Sturday");
            case 7 -> System.out.println("Sunday");


        }

        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }

        switch (day){
            case 1,2,3,4,5 -> System.out.println("weekday");
            case 6,7 -> System.out.println("weekend");
        }

    }
}