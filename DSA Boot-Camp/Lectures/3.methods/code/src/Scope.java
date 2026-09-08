public class Scope {
    static void main() {
        int a = 10;
        int b = 20;
        String name = "JOHN";

        {
        // int a = 78; // already initialised outside the block in the same method, hence ypu cannot initialise again.

            a = 100; // reassigned the original ref variable to a new value

            System.out.println(a);

            int c = 99; // initialised in this block. so the value exists in this block.
            System.out.println(name);

        }

        int c = 900;
        System.out.println(a);
        System.out.println(name);
        System.out.println(c);

        // scoping in 'for' loops
        for (int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
            a = 1000;
        }
        System.out.println();
    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
