/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque;

import co.edu.unbosque.marte.ControladorArchivo;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 *
 * @author F211
 */
public class TestControlArchivo {
    
    @BeforeTest
    public void setTest() throws IOException{
        File f = new File("Documents/juego.txt");
        f.createNewFile();
        FileWriter fw = new FileWriter(f);
        fw.append("7 8");
        fw.append("\n0 0 N");
        fw.append("\nAAIAADDIA");
        fw.close();
    }
    
   @Test
    public void elArchivoExiste() throws FileNotFoundException{
        ControladorArchivo c=new ControladorArchivo("Documents/juego.txt");  
    }
    
   @Test
   public void obtenerElTamañoDelTablero() throws FileNotFoundException, IOException{
       ControladorArchivo c=new ControladorArchivo("Documents/juego.txt");
       String linea=c.getTamañoDelTablero();
       Assert.assertEquals(linea, "7 8");  
   }
   
   @Test
   public void obtenerPosicionDelExplorador() throws FileNotFoundException, IOException{
       ControladorArchivo c=new ControladorArchivo("Documents/juego.txt");
       String linea=c.getPosicionDelExplorador();
       Assert.assertEquals(linea, "0 0 N");  
   }
   
   @Test
   public void obtenerInstruccionDelExploracion() throws FileNotFoundException, IOException{
       ControladorArchivo c=new ControladorArchivo("Documents/juego.txt");
       String linea=c.getInstruccionDeExploracion();
       Assert.assertEquals(linea, "AAIAADDIA");    
   }
   
   @Test
   public void esElFinDelaArchivo() throws FileNotFoundException, IOException{
       ControladorArchivo c=new ControladorArchivo("Documents/juego.txt");
       String linea=c.getElFinDelaArchivo();
       Assert.assertEquals(linea, "null"); 
       
       
   }
    
    
}
