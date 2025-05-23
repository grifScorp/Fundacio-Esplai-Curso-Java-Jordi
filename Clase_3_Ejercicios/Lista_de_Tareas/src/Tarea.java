public class Tarea {
    
    String titulo;
    boolean estado;
    String descripcion;
    

    public Tarea(String titulo, String descripcion, boolean estado) {
        this.titulo = titulo;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    // Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public boolean getEstado() {
        return this.estado;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
         this.descripcion = descripcion;
    }

    public void setEstado(boolean estado) {
         this.estado = estado;
    }

}
