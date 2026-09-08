public class Shadowing {
    static int x = 90;

    static void main() {
        System.out.println(x); // 90

        int x; // the class variable at line 2 is shadowed by this variable
    //    System.out.println(x); // scope will begin when value is initialised
          x = 40;
        System.out.println(x); // 40

    }
    static void fun(){
        System.out.println(x);
    }
}
