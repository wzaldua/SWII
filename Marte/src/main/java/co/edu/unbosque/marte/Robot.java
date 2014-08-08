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
public class Robot {
    Coordenada c;
    public Robot(Coordenada c){
        this.c=c;
    }

    public void ejecutar(char c) {
        this.c=new Coordenada(0,1,'N');
    }

    public Coordenada getCoordenada() {
        return c;
    }
    
}
