import java.util.Scanner;

public class Main {
        
    private static string invert(String texto) {
        
        int position = texto.length();
        String invertido;

        for(int i = 0; i < position; position--) {

            invertido = invertido + texto.charAt(position);

        }

        return invertido;

    }

    private static boolean palindromo (String t1, String t2) {
        if(t1 == t2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Texto a Comprobar:");
        
        String texto = sc.nextLine();

        if (palindromo(texto, invert(texto))) {
            System.out.println("SI es un Palindro!");
        } else {
            System.out.println("NO es un Palindro");
        }

        System.out.println("---Normal: ",texto);
        System.out.println("Invertida: ",invert(texto));
        


    }


}
