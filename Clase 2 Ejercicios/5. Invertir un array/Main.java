import java.util.Arrays;

public class Main {
    
    private static int[] invertirArray(int[] a) {

        int indiceInvertido = 0;
        int[] resultado = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--) {

            resultado[indiceInvertido] = a[i];
            indiceInvertido++;

        }

        return resultado;
    }

    private static void test() {

        int[] ejemplo1 = {1,2,3,4,5,6};
        System.out.println("Array: " + Arrays.toString(ejemplo1));
        System.out.println("Invertido: " + invertirArray(ejemplo1));
        System.out.println("");


        int[] ejemplo2 = {6,5,4,3,2,1};


    }

    public static void main(String[] args) {

        System.out.println("Inversor de Arrays");
        test();
    }
}
