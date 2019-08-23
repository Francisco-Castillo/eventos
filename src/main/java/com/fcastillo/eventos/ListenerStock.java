package com.fcastillo.eventos;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
public class ListenerStock {

    public void escucha(@Observes ArticuloEvent artevt) {
        try {
            System.out.println("El stock del articulo " + artevt.getArticulo().getNombre() + " es de : " + artevt.getArticulo().getStock());
            System.out.println("Guardando en tabla faltantes");
        } catch (Exception e) {
        }
    }
}
