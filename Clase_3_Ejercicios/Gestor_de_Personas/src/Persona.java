public class Persona {
    
    private String nombre;
    private int edad;
    private String email;

    public Persona(String n, int e, String email) {
        this.nombre = n;
        this.edad = e;
        this.email = email;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getEmail() {
        return this.email;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    //Metodos
    public boolean esMayorEdad() {
        return this.edad >= 18; 
    }

    public boolean emailArroba() {
        return this.email.contains("@");
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad + " Correo: " + this.email;
    }

}
