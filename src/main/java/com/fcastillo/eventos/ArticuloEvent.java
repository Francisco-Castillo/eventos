package com.fcastillo.eventos;

public class ArticuloEvent {

    private Articulo articulo;

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public ArticuloEvent(Articulo articulo) {
        this.articulo = articulo;
    }

}
