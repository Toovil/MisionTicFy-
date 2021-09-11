/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misionticfy;

import controlador.Conector;
import vista.AlbumVista;
/**
 *
 * @author Vane
 */
public class MisionTicFY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conector.conectar();
        // TODO code application logic here
        // Abrir vista principal
        AlbumVista pantalla_animal = new AlbumVista();
        pantalla_animal.setVisible(true);
    }
    
}
