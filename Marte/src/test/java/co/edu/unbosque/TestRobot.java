/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.Coordenada;
import co.edu.unbosque.marte.Robot;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author F211
 */
public class TestRobot {
    @Test
    public void seCreaElRobotEnUnaCoordenadaValida(){
        Coordenada c=new Coordenada(0,0,'S');
        Robot r=new Robot(c);
    }
    
    @Test(expectedExceptions = {IllegalArgumentException.class})
    public void NoseCreaElRobotEnUnaCoordenadaValida(){
        Coordenada c=new Coordenada(0,-1,'S');
        Robot r=new Robot(c);
    }
    
    @Test
    public void seCreaMovimientoARobot(){
       Coordenada c=new Coordenada(0,0,'N');
        Robot r=new Robot(c); 
        r.ejecutar('A');
        c=r.getCoordenada();
        Coordenada esperada=new Coordenada(0,1,'N');
        Assert.assertEquals(c, esperada);
    }
    
    
}
