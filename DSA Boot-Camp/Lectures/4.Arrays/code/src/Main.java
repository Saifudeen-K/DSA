public class Main {
    static void main() {

        // store a roll number
        int roll_no = 40;

        // store a person's name
        String name = "john";

        // store 5 roll numbers
        int rn01 = 1;
        int rn02 = 2;
        int rn03 = 3;
        int rn04 = 4;
        int rn05 = 5;  // inefficient way

        // Arrays
        // array syntax : datatype[] variable_name = new datatype[size];

        // store 5 numbers using Array
        int[] rnos = new int[5];

        // or we can directly store
        int[] rnos2 = {1, 2, 3, 4, 5};

        int[] ros; // declaration of an array. ros is getting defined in the stack.
        ros = new  int[5]; // initialisation. Array objects is being created in the heap memory.


        String[] arr = new String[5];
        System.out.println(arr[0]);

        // for (String element : arr) {
        //    System.out.println(element);
        // }

    }

}