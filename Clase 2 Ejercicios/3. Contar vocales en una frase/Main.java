import java.util.Scanner;

public class Main {

    private static String vocales(String a) {
        
        String vocales = "";
        char l = '\0';

        for (int i = 0; i <= a.length() - 1; i++) {
            
            l = a.charAt(i);            
            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'U' || l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {

                vocales = vocales + l;

            }
        }

        return vocales;
    }

    private static void test() {
    
        System.out.println();
        String texto = "Hola que tal?";
        System.out.println("Frase: " + texto);
        System.out.println("Hay " + vocales(texto).length() + " Vocales: " + vocales(texto));
        System.out.println();

        texto = "Lorem Ipsum?";
        System.out.println("Frase: " + texto);
        System.out.println("Hay " + vocales(texto).length() + " Vocales: " + vocales(texto));
        System.out.println();

        texto = "Mi nombre es Jiasheng";
        System.out.println("Frase: " + texto);
        System.out.println("Hay " + vocales(texto).length() + " Vocales: " + vocales(texto));
        System.out.println();
    
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        test();

        System.out.println();
        System.out.println("Contador de Vocales");
        
        System.out.print("Texto: ");
        String texto = sc.nextLine();
        
        System.out.println("Hay " + vocales(texto).length() + " Vocales: " + vocales(texto));
        System.out.println();

        sc.close();

    }
}
