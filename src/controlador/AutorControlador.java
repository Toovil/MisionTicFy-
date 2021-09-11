/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.AutorModelo;
import java.util.ArrayList;

/**
 *
 * @author Vane
 */
public class AutorControlador {
    
    private static ArrayList<AutorModelo> listAutor = new ArrayList<AutorModelo>();
    
    public static ArrayList<AutorModelo> lista_autores() {
        ArrayList<ArrayList<String>> result = AutorModelo.lista_autores();
        ArrayList<AutorModelo> lista = new ArrayList<>();
        for (ArrayList<String> list : result) {
            AutorModelo album = new AutorModelo(
                    Integer.parseInt(list.get(0)),
                    list.get(1),
                    list.get(2),
                    list.get(3), false);
            lista.add(album);
        }
        listAutor = lista;
        return listAutor;
    }
    
}
