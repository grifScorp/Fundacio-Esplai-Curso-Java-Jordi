package com.java.clase;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Pedido> pedidos;
    List<Cliente> clientes;
    Carta carta;

    public Restaurante(){
        this.carta = new Carta();
        this.pedidos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    private boolean allPlatosExists(List<Plato> platos){
        for(Plato plato : platos){
            if(!this.carta.platoExists(plato.getId())){
                return false;
            }
        }
        return true;
    }

    public void createPedido(List<Plato> platos, int clienteId){
        if(!clienteExists(clienteId)){
            System.err.println("El cliente no existe");
            return;
        }
        if(!allPlatosExists(platos)){
            System.err.println("Algun plato no existe");
            return;
        }

        Pedido pedido = new Pedido(platos, clienteId);
        this.pedidos.add(pedido);
    }

    public void entregarPedido(int pedidoId){
        for(Pedido pedido : this.pedidos){
            if(pedido.getId() == pedidoId){
                pedido.entregar();
                return;
            }
        }
        System.err.println("El pedido no existe");
    }

    public void addPlato(Plato plato){
        try {
            this.carta.addPlato(plato);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    private boolean clienteExists(int clienteId){
        for(Cliente cliente : this.clientes){
            if(cliente.getId() == clienteId){
                return true;
            }
        }
        return false;
    }

    public void addCliente(Cliente cliente){
        if(clienteExists(cliente.getId())){
            System.err.println("El cliente ya existe");
            return;
        }
        this.clientes.add(cliente);
    }

    public void logRestaurante(){
        System.out.println("Restaurante: ");
        System.out.println("Pedidos: ");
        for(Pedido pedido : this.pedidos){
            pedido.logPedido();
        }
        System.out.println("Carta: ");
        carta.logCarta();
        System.out.println("Clientes: ");
        for(Cliente cliente : this.clientes){
            cliente.logCliente();
        }
    }
    
    
}
