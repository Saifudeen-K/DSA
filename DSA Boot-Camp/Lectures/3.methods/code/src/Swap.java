public class Swap {
    static void main() {
        int a = 10;
        int b= 20;

        // swap numbers code
        int temp = a;
        a = b;
        b = temp;

        swap(a,b);

        String name = "Kunal Khushwaha";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String naam){
        naam = "Rahul Raana"; // CREATING A NEW OBJECT
    }
    static void swap(int num1, int num2){

        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}
