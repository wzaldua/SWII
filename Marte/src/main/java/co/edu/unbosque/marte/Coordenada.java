/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque.marte;

/**
 *
 * @author F211
 */
public class Coordenada {

    private int x;
    private int y;
    private char orientacion;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }
    public Coordenada(int x, int y, char orientacion) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("coordenadas x,y invalidas");
        }
        String tmp = "" + orientacion;
        if (!tmp.matches("[NSEO]*")) {
            
        }
    }

}
