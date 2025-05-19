import java.util.Scanner;

public class Main {
    
    private static int factorial(int n) {

        int resultado = n;

        for (int i = n; i > 1; i--) {

            resultado = resultado * (i - 1);

        }

        return resultado;
    }

    private static void test() {
        int num = 3;
        System.out.println("Numero:" + num);
        System.out.println("Factorial:" + (factorial(num)));
        System.out.println("");


        num = 4;
        System.out.println("Numero:" + num);
        System.out.println("Factorial:" + (factorial(num)));
        System.out.println("");


        num = 5;
        System.out.println("Numero:" + num);
        System.out.println("Factorial:" + (factorial(num)));
        System.out.println("");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        test();

        System.out.print("Numero:");
        int numero = sc.nextInt();

        System.out.print("Resultado: ");
        System.out.print(factorial(numero));
        sc.close();
    }
}