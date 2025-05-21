
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();
        
        Cliente cliente1 = new Cliente("Juan");
        restaurante.addCliente(cliente1);
        Cliente cliente2 = new Cliente("Maria");
        restaurante.addCliente(cliente2);

        Plato plato1 = new Plato("Pizza", 10.0f);
        restaurante.addPlato(plato1);

        Plato plato2 = new Plato("Hamburguesa", 8.0f);
        restaurante.addPlato(plato2);

        List<Plato> platos = new ArrayList<>();
        platos.add(plato1);
        restaurante.createPedido(platos, cliente1.getId());

        List<Plato> platos2 = new ArrayList<>();
        platos2.add(plato1);
        platos2.add(plato2);
        restaurante.createPedido(platos2, cliente2.getId());

        restaurante.entregarPedido(1);

        restaurante.logRestaurante();

    }
}