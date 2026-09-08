import java.util.Arrays;

public class VarArgs {
    static void main() {

        fun();
        mutiple(33, 44, "john","dale","ben");
        demo("sarah");

    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void mutiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
