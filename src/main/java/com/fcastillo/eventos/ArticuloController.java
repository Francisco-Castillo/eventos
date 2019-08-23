
package com.fcastillo.eventos;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;

@Named(value = "articuloController")
@RequestScoped
public class ArticuloController {
    
    @Inject
    Event<ArticuloEvent> evento;
    
    @Inject
    ServicioArticulo art;
    
    private Articulo articulo = new Articulo();
    
    public Articulo getArticulo() {
        return articulo;
    }
    
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    
    @PostConstruct
    public void init() {
        articulo.setIdArticulo(1);
        articulo.setNombre("Remera");
        articulo.setStock(99);
        
        art.controlarStock(articulo);
    }
}
