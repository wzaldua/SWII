/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unbosque;

import co.edu.unbosque.marte.Coordenada;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestCoordenada {

    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void NoCreaLaCoordenada() {
        Coordenada c = new Coordenada(-1, 0, 'R');
    }
    
    @Test
    public void NoCreaLaCoordenadaXOrientacion() {
        Coordenada c = new Coordenada(0, 0, 'R');
    }
}
