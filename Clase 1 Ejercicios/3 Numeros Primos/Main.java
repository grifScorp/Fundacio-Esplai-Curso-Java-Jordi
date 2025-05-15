import java.util.Scanner;

public class Main {

    private static boolean isPrime(int n) {
        
        boolean result;

        /* 
        if (n / n  == 1 && n / 2 == 1) {
            result = true;
        } else {
            result = false;
        }
        */

        int divisores = 0;

        if (n == 1 || n == 2) {
            result = true;
            return result;
        }


        for(int i = 1; i >= n; i++) {
            if (n % i == 0) {
                divisores++;
                System.err.println(divisores);
            }
        }

        if (divisores == 2) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    private static void testIsPrime() {
        if(isPrime(1) == true) {
            System.out.println("SI es Primo");
        }
        else {
            System.err.println("NO es Primo");
        }

        if(isPrime(2) == true) {
            System.out.println("SI es Primo");
        }
        else {
            System.err.println("NO es Primo");
        }

        if(isPrime(12) == true) {
            System.out.println("SI es Primo");
        }
        else {
            System.err.println("NO es Primo");
        }

    }
    public static void main(String[] args) {
        
        testIsPrime();

        Scanner sc = new Scanner(System.in);

        System.out.println("Numero a comprobar:");
        int numero = sc.nextInt();

        if(isPrime(numero) == true) {
            System.out.println("Es Primo");
        } else {
            System.out.println("NO es Primo");
        }
        sc.close();

    }
}
