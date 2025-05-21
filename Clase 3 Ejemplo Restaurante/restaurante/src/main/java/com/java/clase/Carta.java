package com.java.clase;

import java.util.ArrayList;
import java.util.List;

public class Carta {
    List<Plato> platos;

    public Carta(){
        this.platos = new ArrayList<>();
    }

    public boolean platoExists(int platoId){
        Plato plato = this.getPlato(platoId);
        return plato != null;
    }

    public void addPlato(Plato plato) throws IllegalArgumentException{
        if(plato == null){
            throw new IllegalArgumentException("El plato no puede ser nulo");
        }
        int platoId = plato.getId();
        if(this.platoExists(platoId)){
            throw new IllegalArgumentException("El plato ya existe");
        }
        this.platos.add(plato);
    }

    public Plato getPlato(int platoId){
        for(Plato plato : this.platos){
            if(plato.getId() == platoId){
                return plato;
            }
        }
        return null;
    }

    public void logCarta(){
        System.out.println("Carta: ");
        for(Plato plato : this.platos){
            plato.logPlato();
        }
    }
}
