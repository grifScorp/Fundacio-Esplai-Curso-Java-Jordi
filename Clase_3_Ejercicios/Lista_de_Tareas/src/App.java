import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static ArrayList<Tarea> listaTareas = new ArrayList<>();

    static void ejemplo() {
        Tarea t2 = new Tarea("Barrer", "Barrer la casa en su completitud", false);
        Tarea t3 = new Tarea("Limpiar", "Limpiar Platos de la Cocina", false);
        Tarea t4 = new Tarea("Suspender", "Suspender en lo que sea", true);

        listaTareas.add(t2);
        listaTareas.add(t3);
        listaTareas.add(t4);
    }
    
    static String estado(boolean estado) {
        return estado ? "Completada" : "Pendiente";
    }

    static void mostrarTarea(Tarea tarea) {
        System.out.println(
            "Tarea: " + tarea.titulo + "\n"
            + "Descripcion: " + tarea.descripcion + "\n"
            + "Estado: " + estado(tarea.estado) + "\n"
        );
    }

    public static void main(String[] args) throws Exception {
        
        ejemplo();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (true) {
            
            listaTareas.forEach(App::mostrarTarea);
            
            System.out.println("Gestor de Tareas\n\n"
                + "1. Crear Tarea\n" 
                + "2. Borrar Tarea\n"
                + "3. Mostrar Tarea\n"
                + "4. Cambiar estado Tarea\n"
                + "5. Salir\n"
            );
            System.out.println("Opcion:");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:                    
                    System.out.println("Nombre de la tarea: ");
                    String nombre = sc.nextLine();
                    
                    System.out.println("Descripcion: ");
                    String descripcion = sc.nextLine();

                    System.out.println("Tarea Creada!");

                    Tarea t1 = new Tarea(nombre, descripcion, false);
                    listaTareas.add(t1);
                    break;
                case 2:
                    System.out.println("Posicion: ");
                    int posicion = sc.nextInt();
                    listaTareas.remove(posicion);
                    break;
                case 3:
                    System.out.println("Posicion: ");
                    posicion = sc.nextInt();
                    Tarea getTarea = listaTareas.get(posicion);
                    mostrarTarea(getTarea);
                    break;
                case 4:
                    System.out.println("Posicion de la Tarea: ");
                    posicion = sc.nextInt();
                    getTarea = listaTareas.get(posicion);
                    mostrarTarea(getTarea);

                    System.out.println("Cambiar estado a:\n1-Completado\n2-Pendiente");
                    int estado = sc.nextInt();

                    if (estado == 1) {
                        getTarea.setEstado(true);
                    } else {
                        getTarea.setEstado(false);
                    
                    }
                    System.out.println("Cambio de Estado Realizado");
                    mostrarTarea(getTarea);
                    break;
                case 5:
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
        }
    }

}
