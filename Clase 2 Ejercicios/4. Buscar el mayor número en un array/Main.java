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

        int[] ejemplo2 = {3,2,5,70,34,23,45};

        int[] ejemplo3 = {3,45,345,234,654,234};
    }

    public static void main(String[] args) {

        System.out.println("Encontrar el numero mas Grande de un Array");


    }
}
