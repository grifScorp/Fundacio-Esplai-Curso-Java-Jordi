import java.util.Scanner;

public class Main {
    
    private static int factorial(int n) {

        int resultado = n;

        for (int i = n; i > 1; i--) {

            resultado = resultado * (i - 1);

        }

        return resultado;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Numero:");
        int numero = sc.nextInt();

        System.out.print("Resultado: ");
        System.out.print(factorial(numero));
        sc.close();
    }
}