/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gherni
 */
public class resultados implements Serializable{
    int contador;
    ArrayList ub;
    public resultados(int contador,ArrayList ub){
        this.contador = contador;this.ub=ub;
    }

    @Override
    public String toString() {
        return "resultados{" + "contador=" + contador + ", ub=" + ub + '}';
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void setUb(ArrayList ub) {
        this.ub = ub;
    }

    public int getContador() {
        return contador;
    }

    public ArrayList getUb() {
        return ub;
    }
    
}
