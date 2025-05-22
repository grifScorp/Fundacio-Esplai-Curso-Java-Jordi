import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static ArrayList<Persona> listaPersonas = new ArrayList<>();
    public static void main(String[] args) throws Exception {

        Persona p1 = new Persona("Aurelio", 16, "aurelio@gmail.com");
        Persona p2 = new Persona("Ezequiel", 20, "Ezequiel@gmail.com");

        listaPersonas.add(p1);
        listaPersonas.add(p2);

        Scanner sc = new Scanner(System.in);        
        int opcion = -1;

        while(opcion != 0) {

            System.out.println("\nGestor de Personas\n");

            test();
            
            System.out.println("");
            System.out.println("1. Crear Persona");
            System.out.println("2. Comprobar Edad");
            System.out.println("3. Borrar Persona");
            System.out.println("0. Salir");

            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();


            switch (opcion) {
                case 0:
                    opcion = 0;
                    break;
                case 1:                    
                    System.out.print("Nombre de la Persona: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    Persona p3 = new Persona(nombre, edad, email);
                    
                    while (!p3.emailArroba()) {
                        System.out.println("Email Incorrecto, Corrija ");
                        System.out.println("Email: ");
                        email = sc.nextLine();
                        p3.setEmail(email);
                    }
                    listaPersonas.add(p3);
                    System.out.println("Creación Exitosa!\n");                    

                    break;
                case 2:
                    System.out.print("Posicion en la lista: ");
                    int i = sc.nextInt();
                    sc.nextLine();
                    Persona p = listaPersonas.get(i);

                    if (p.esMayorEdad()) {
                        System.out.print(p.getNombre() + " Edad: " + p.getEdad() + " ");
                        System.out.print("Si es Mayor de Edad");
                    } else {
                        System.out.print(p.getNombre() + " Edad: " + p.getEdad() + " ");
                        System.out.print("No es Mayor de Edad");
                    }
                    
                    break;
                default:
                    System.out.println("Opcion no Permitida");;
                    break;
            }
        }
        sc.close();
    }

    public static void test() {
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
        
    }
}
