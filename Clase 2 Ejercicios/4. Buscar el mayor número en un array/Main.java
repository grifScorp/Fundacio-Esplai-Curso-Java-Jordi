import java.util.Arrays;

public class Main {
    
    public static int encontrarNumeroMayor(int[] a) {

        int numMax = 0;

        for (int i = 1; i < a.length; i++) {

            if (a[i] > numMax) {
                numMax = a[i];
            }

        }

        return numMax;
    }

    public static void test() {

        int[] ejemplo1 = {3,2,5,7,2,8,0,9};
        System.out.println("Array: " + Arrays.toString(ejemplo1));
        System.out.println("El numero mas grande es: " + encontrarNumeroMayor(ejemplo1));
        System.out.println();

        int[] ejemplo2 = {3,2,5,70,34,23,45};
        System.out.println("Array: " + Arrays.toString(ejemplo2));
        System.out.println("El numero mas grande es: " + encontrarNumeroMayor(ejemplo2));
        System.out.println();

        int[] ejemplo3 = {3,45,345,234,654,234};
        System.out.println("Array: " + Arrays.toString(ejemplo3));
        System.out.println("El numero mas grande es: " + encontrarNumeroMayor(ejemplo3));
        System.out.println();
    
    }

    public static void main(String[] args) {
    
        System.out.println("Encontrar el numero mas Grande de un Array");
        test();
    }
}
