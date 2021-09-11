/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.AlbumModelo;
import modelo.AutorModelo;
import java.util.ArrayList;

/**
 *
 * @author Vane
 */
public class AlbumControlador {

    private static ArrayList<AlbumModelo> listAlbum = new ArrayList<AlbumModelo>();

    public static AlbumModelo crear_album(int id_album, int numero_canciones, double rating, int id, AutorModelo autor, String nombre, double precio, String Genero) {
        AlbumModelo album = new AlbumModelo(id_album, numero_canciones, rating, id, autor, nombre, precio, Genero, true);
        return album;
    }

    public static ArrayList<AlbumModelo> lista_albumes() {
        ArrayList<ArrayList<String>> result = AlbumModelo.lista_albumes();
        ArrayList<AlbumModelo> lista = new ArrayList<>();
        for (ArrayList<String> list : result) {
            AlbumModelo album = new AlbumModelo(
                    Integer.parseInt(list.get(7)),
                    Integer.parseInt(list.get(4)),
                    Double.parseDouble(list.get(5)),
                    Integer.parseInt(list.get(6)),
                    new AutorModelo(
                            Integer.parseInt(list.get(8)),
                            list.get(1),
                            list.get(9),
                            list.get(10),
                            false),
                    list.get(0),
                    Integer.parseInt(list.get(3)),
                    list.get(2),
                    false);
            lista.add(album);
        }
        listAlbum = lista;
        return listAlbum;
    }
    
    public static void eliminar_album( int id, int id_album) {
        AlbumModelo.deleteAlbum(id, id_album);
    }
    
    public static void editar_album(int id_album, int numero_canciones, double rating, int id, AutorModelo autor, String nombre, double precio, String Genero) {
        AlbumModelo.editAlbum(id_album, numero_canciones, rating, id, autor, nombre, precio, Genero);
    }

}
