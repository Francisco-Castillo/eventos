
package com.fcastillo.eventos;

import java.time.LocalTime;
import javax.ejb.Schedule;
import javax.ejb.Stateless;

/**
 *
 * @author fcastillo
 */
@Stateless
public class PlanificadorTareas {

    @Schedule(minute = "*", hour = "*")
    public void ejecutar() {
        LocalTime time = LocalTime.now();
        System.out.println("Ejecutado a las : " + time);
    }
}
