/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.ControladorArchivo;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestControlArchivo {
    
    @Test
    public void elArchivoExiste(){
        ControladorArchivo c=new ControladorArchivo("d:/juego.txt");
        
    }
}
