package com.fcastillo.eventos;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class ListenerStock {

    public void escucha(@Observes ArticuloEvent artevt){
        try {
            System.out.println("El stock de este articulo es menor a 100");
            System.out.println("Guardando en tabla faltantes");
        } catch (Exception e) {
        }
    }
}
