package errors_handling;

public class Main {
    public static void recursiveMethod() {
        recursiveMethod();
    }
    public static void main(String[] args) {

        String[] array = new String[5];
        array[0] = "Hello";
        array[1] = "World";
        array[2] = "Hello";
        array[3] = "World";
        array[4] = "Hello";
        for (int i = 0; i < array.length + 1; i++) {
            try{
                System.out.println(array[i]);
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Array index is out of bounds");
            }
        }
        Integer[] array2 = new Integer[3];
        array2[0] = 1;
        array2[1] = 0;
        array2[2] = 3;

        for (Integer integer : array2) {
            try {
                System.out.println(5 / integer);
            } catch (ArithmeticException e) {
                System.out.printf("%d can't divide by zero", integer);
            }
        }
        /*
        recursiveMethod();
        int[] array_new = new int[999999999];

         */



    }

}
