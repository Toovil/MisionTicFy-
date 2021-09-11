/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juan
 */
public class ProductoModelo {
     //Atributos
    
    private int id;
    private AutorModelo autor;
    private String nombre;
    private double precio;
    private String Genero;

    public ProductoModelo(int id,AutorModelo autor, String nombre, double precio, String Genero) {
        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.precio = precio;
        this.Genero = Genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AutorModelo getAutor() {
        return autor;
    }

    public void setAutor(AutorModelo autor) {
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
}
