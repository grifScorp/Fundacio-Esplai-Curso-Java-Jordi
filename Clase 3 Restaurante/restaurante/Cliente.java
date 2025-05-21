
public class Cliente {
    private static int idCounter = 0;

    private int id;
    private String nombre;

    public Cliente(String nombre){
        this.id = ++idCounter;
        this.nombre = nombre;
    }

    public int getId(){
        return this.id;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void logCliente(){
        System.out.println("Cliente: " + this.id + ", nombre: " + this.nombre);
    }
}
