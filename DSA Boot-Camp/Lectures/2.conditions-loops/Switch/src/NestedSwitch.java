import java.util.Scanner;

public class NestedSwitch {
    static void main() {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String department = in.next();

        switch (empId){
            case 1:
                System.out.println("Kunal Khushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department Entered");

                }
                break;
        }
        System.out.println("Enter Correct EmpID");


        // better way to write
        switch (empId) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

    }
}
