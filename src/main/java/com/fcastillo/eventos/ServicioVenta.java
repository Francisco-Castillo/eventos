/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.eventos;

import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author fcastillo
 */
@Named(value = "servicioVenta")
@RequestScoped
public class ServicioVenta {

    @Inject
    ServicioNotificacion sn;
    private Articulo articulo = new Articulo();

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @PostConstruct
    public void init() {
        articulo.setIdArticulo(2);
        articulo.setNombre("Jugo");
        articulo.setStock(0);

        venderArticulo(articulo);
    }

    public void venderArticulo(Articulo articulo) {
        if (articulo.getStock() > 0) {
            System.out.println("Articulo vendido....");
        } else {
            sn.notificarFaltante(articulo);
        }
    }
}
