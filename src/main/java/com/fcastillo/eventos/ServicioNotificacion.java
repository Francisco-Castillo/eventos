/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.eventos;

import javax.ejb.Stateless;

/**
 *
 * @author fcastillo
 */
@Stateless
public class ServicioNotificacion {

    public void notificarFaltante(Articulo a) {
        System.out.println("Existe un faltante de " + a.getNombre());
    }
}
