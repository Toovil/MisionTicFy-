/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.Conector;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class AlbumModelo extends ProductoModelo {

    private int id_album;
    private int numero_canciones;
    private double rating;

    public AlbumModelo(int id_album, int numero_canciones, double rating, int id, AutorModelo autor, String nombre, double precio, String genero, boolean create) {
        super(id, autor, nombre, precio, genero);
        this.id_album = id_album;
        this.numero_canciones = numero_canciones;
        this.rating = rating;
        if (create) {
            crear_album();
        }
    }

    public int getId_album() {
        return id_album;
    }

    public void setInt_cancion(int id_album) {
        this.id_album = id_album;
    }

    public int getNumero_canciones() {
        return numero_canciones;
    }

    public void setNumero_canciones(int numero_canciones) {
        this.numero_canciones = numero_canciones;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void crear_album() {
        String queryProducto = "INSERT INTO producto(nombre, precio, genero, autor_id) VALUES (?,?,?,?)";
        String queryIdProducto = "Select Last_insert_id()";
        String queryAlbum = "INSERT INTO album(numero_canciones, rating, producto_id) VALUES (?,?,?)";
        try {
            PreparedStatement statement = Conector.getConn().prepareStatement(queryProducto);
            statement.setString(1, getNombre());
            statement.setDouble(2, getPrecio());
            statement.setString(3, getGenero());
            statement.setInt(4, getAutor().getId_autor());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Se creó el producto");
            }
            Statement statementId = Conector.getConn().createStatement();
            ResultSet result = statementId.executeQuery(queryIdProducto);
            while (result.next()) {
                int id = result.getInt(1);
                setId(id);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {
            System.out.println(getId());
            PreparedStatement statement = Conector.getConn().prepareStatement(queryAlbum);
            statement.setInt(1, numero_canciones);
            statement.setDouble(2, rating);
            statement.setInt(3, getId());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Se creó el album");
            }
            Statement statementId = Conector.getConn().createStatement();
            ResultSet result = statementId.executeQuery(queryIdProducto);
            while (result.next()) {
                int id = result.getInt(1);
                this.id_album = id;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static ArrayList<ArrayList<String>> lista_albumes() {
        String query = "SELECT producto.nombre, autor.nombre, genero, precio, numero_canciones, rating, producto.id, album.id, autor.id, autor.nacionalidad, autor.tipo\n"
                + "FROM productos.album \n"
                + "inner join productos.producto on album.producto_id = producto.id\n"
                + "inner join productos.autor on producto.autor_id = autor.id;";
        ArrayList<ArrayList<String>> listAlbum = new ArrayList<>();
        try {
            Statement statement = Conector.getConn().createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                ArrayList<String> album = new ArrayList<>();
                album.add(result.getString(1));
                album.add(result.getString(2));
                album.add(result.getString(3));
                album.add(result.getString(4));
                album.add(result.getString(5));
                album.add(result.getString(6));
                album.add(result.getString(7));
                album.add(result.getString(8));
                album.add(result.getString(9));
                album.add(result.getString(10));
                album.add(result.getString(11));
                listAlbum.add(album);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listAlbum;
    }

    public static void deleteAlbum(int id, int id_album) {
        String queryAlbum = "DELETE FROM album WHERE id = ?";
        try {
            PreparedStatement statement = Conector.getConn().prepareStatement(queryAlbum);
            statement.setInt(1, id_album);
            int rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        String query = "DELETE FROM producto WHERE id = ?";
        try {
            PreparedStatement statement = Conector.getConn().prepareStatement(query);
            statement.setInt(1, id);
            int rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void editAlbum(int id_album, int numero_canciones, double rating, int id, AutorModelo autor, String nombre, double precio, String genero) {
        String queryProducto = "UPDATE producto SET nombre = ?, precio = ?, genero = ?, autor_id = ? where id = ?";
        String queryAlbum = "UPDATE album SET numero_canciones = ?, rating = ?, producto_id = ? where id = ?";
        try {
            PreparedStatement statement = Conector.getConn().prepareStatement(queryProducto);
            statement.setString(1, nombre);
            statement.setDouble(2, precio);
            statement.setString(3, genero);
            statement.setInt(4, autor.getId_autor());
            statement.setInt(5, id);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Se editó el producto");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        try {
            PreparedStatement statement = Conector.getConn().prepareStatement(queryAlbum);
            statement.setInt(1, numero_canciones);
            statement.setDouble(2, rating);
            statement.setInt(3, id);
            statement.setInt(4, id_album);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Se editó el album");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
