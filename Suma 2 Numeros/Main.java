import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Suma de 2 Numeros");
        
        System.out.println("Primer Numero:");
        int scan1 = sc.nextInt();
        
        System.out.println("Segundo Numero:");
        int scan2 = sc.nextInt();

        int resultado = scan1 + scan2;
        System.out.println("Resultado:");
        System.out.println(resultado);

        sc.close();
    }
}