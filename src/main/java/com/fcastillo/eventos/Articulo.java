
package com.fcastillo.eventos;

public class Articulo {

    private int idArticulo;
    private String nombre;
    private int stock;

    public Articulo() {
    }

    public Articulo(int idArticulo, String nombre, int stock) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.stock = stock;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
