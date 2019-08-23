package com.fcastillo.eventos;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Stateless
public class ServicioArticulo {
    
    @Inject
    Event<ArticuloEvent> evtArticulo;
    
    public void controlarStock(Articulo articulo) {
        if (articulo.getStock() < 100) {
            evtArticulo.fire(new ArticuloEvent(articulo));
        }
    } 
}
