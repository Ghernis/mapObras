/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;

/**
 *
 * @author Gherni
 */
public class obras implements Serializable{
    String tt,ubicacion,equipos;
    public obras(String tt,String ubicacion,String equipos){
        this.tt=tt;this.ubicacion=ubicacion;this.equipos=equipos;
    }

    @Override
    public String toString() {
        return "obras{" + "tt=" + tt + ", ubicacion=" + ubicacion + ", equipos=" + equipos + '}';
    }

    public void setTt(String tt) {
        this.tt = tt;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setEquipos(String equipos) {
        this.equipos = equipos;
    }

    public String getTt() {
        return tt;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getEquipos() {
        return equipos;
    }
    
    
}
