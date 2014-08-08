/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.unbosque.marte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author F211
 */
public class ControladorArchivo {

    BufferedReader br;
    String tamañoTablero;
    String posicionDelExplorador;
    String InstruccionDeExploracion;
    public ControladorArchivo(String djuegotxt) throws FileNotFoundException {
        File f=new File(djuegotxt);
        FileInputStream fin=new FileInputStream(f);
        br=new BufferedReader(new InputStreamReader(fin));
        
    }

    public String getTamañoDelTablero() throws IOException {
        tamañoTablero = br.readLine();
        return tamañoTablero;
    }

    public String getPosicionDelExplorador() throws IOException {
        for(int con  = 0;con <= 1; con++){
            posicionDelExplorador = br.readLine();
        }
        return posicionDelExplorador;
    }

    public String getInstruccionDeExploracion() throws IOException {
        for(int con  = 0;con <= 2; con++){
            InstruccionDeExploracion = br.readLine();
        }
        return InstruccionDeExploracion;
    }

    public String getElFinDelaArchivo() throws IOException {
        for(int con  = 0;con <= 3; con++){
            br.readLine();
        }
        return "null";
    }
    
}
