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
public class ubicacion implements Serializable{
    String x,y,et;
    public ubicacion(String x,String y,String et){
        this.x=x;this.y=y;this.et=et;
    }

    @Override
    public String toString() {
        return "ubicacion{" + "x=" + x + ", y=" + y + ", et=" + et + '}';
    }

    public void setX(String x) {
        this.x = x;
    }

    public void setY(String y) {
        this.y = y;
    }

    public void setEt(String et) {
        this.et = et;
    }

    public String getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public String getEt() {
        return et;
    }
    
}
