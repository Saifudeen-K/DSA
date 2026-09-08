import java.util.Scanner;

public class Sum {
    static void main() {

    //    int ans = sum2();
     //   System.out.println(ans);
     //   sum();

        int ans = sum3(20,30);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b) {
        int sum = a + b;
        return sum;
    }


    // return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
//        System.out.println("This will never execute");
    }

        static void sum(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
        //int sum = num1 + num2;
    }
    /*
            return_type name(arguments){
                // body
                return statement;

     */
}
