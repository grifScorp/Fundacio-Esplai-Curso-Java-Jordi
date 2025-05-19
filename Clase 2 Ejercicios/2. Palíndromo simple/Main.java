import java.util.Scanner;

public class Main {
        
    private static String invert(String texto) {  

        int position = texto.length() - 1;
        String invertido = "";

        for(int i = -1; position > i; position--) {

            invertido = invertido + texto.charAt(position);
        }

        return invertido;
    }

    private static boolean palindromo (String t1, String t2) {

        if(t1.equals(t2)) {
            return true;
        } else {
            return false;
        }
    }

    private static void test() {
        String texto = "oso";

        System.out.println("Tu texto:  " + texto);
        System.out.println("Invertido: " + invert(texto));
        if (palindromo(texto, invert(texto))) {
            System.out.println("SI es un Palindro!");
        } else {
            System.out.println("NO es un Palindro!");
        }
        System.out.println();


        texto = "reconocer";
        System.out.println("Tu texto:  " + texto);
        System.out.println("Invertido: " + invert(texto));
        if (palindromo(texto, invert(texto))) {
            System.out.println("SI es un Palindro!");
        } else {
            System.out.println("NO es un Palindro!");
        }
        System.out.println();


        texto = "Hola";
        System.out.println("Tu texto:  " + texto);
        System.out.println("Invertido: " + invert(texto));
        if (palindromo(texto, invert(texto))) {
            System.out.println("SI es un Palindro!");
        } else {
            System.out.println("NO es un Palindro!");
        }
        System.out.println();

    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        test();

        System.out.println("");
        System.out.print("Texto a Comprobar:");
        String texto = sc.nextLine();

        System.out.println("Invertido: " + invert(texto));
        System.out.println("");

        if (palindromo(texto, invert(texto))) {
            System.out.println("SI es un Palindro!");
        } else {
            System.out.println("NO es un Palindro!");
        }

        System.out.println("");        
        sc.close();

    }

}
