
import java.util.List;

public class Pedido {
    enum Estado {
        PENDIENTE,
        ENTREGADO
    }

    private static int idCounter = 0;

    private int id;
    private List<Plato> platos;
    private int clienteId;
    private Estado estado;

    public Pedido(List<Plato> platos, int clienteId){
        this.id = ++idCounter;
        this.platos = platos;
        this.clienteId = clienteId;
        this.estado = Estado.PENDIENTE;
    }

    public void entregar(){
        this.estado = Estado.ENTREGADO;
    }

    public int getId(){
        return this.id;
    }

    public List<Plato> getPlatos(){
        return this.platos;
    }

    public int getClienteId(){
        return this.clienteId;
    }

    public Estado getEstado(){
        return this.estado;
    }

    public void logPedido(){
        System.out.println("Pedido: " + this.id);
        System.out.println("Platos: ");
        for(Plato plato : this.platos){
            plato.logPlato();
        }
        System.out.println("Cliente: " + this.clienteId);
        System.out.println("Estado: " + this.estado);
    }
}
