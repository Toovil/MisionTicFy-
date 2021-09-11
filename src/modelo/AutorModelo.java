/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Conector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class AutorModelo {
   private int id_autor;
   private String nombre;
   private String nacionalidad;
   private  String tipo;

    public AutorModelo(int id_autor, String nombre, String nacionalidad, String tipo, boolean create) {
        this.id_autor = id_autor;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.tipo = tipo;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static ArrayList<ArrayList<String>> lista_autores(){
        String query = "SELECT * FROM autor";
        ArrayList<ArrayList<String>> listAutor = new ArrayList<>();
        try{
            Statement statement = Conector.getConn().createStatement();
            ResultSet result = statement.executeQuery(query);

            while(result.next()){
                ArrayList<String> album = new ArrayList<>();
                album.add(result.getString(1));
                album.add(result.getString(2));
                album.add(result.getString(3));
                album.add(result.getString(4));
                listAutor.add(album);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
        return listAutor;
    }
    
}
