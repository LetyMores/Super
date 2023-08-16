/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4g2menu;

/**
 *
 * @author LENOVO
 */
public class Producto implements Comparable<Producto>{
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categorias rubro;

    public Producto(int codigo, String descripcion, double precio, int stock, Categorias rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categorias getRubro() {
        return rubro;
    }

    public void setRubro(Categorias rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto t) {
        if (codigo == t.codigo) {
         
        return 0;
        }else if (codigo > t.codigo){
        return 1;
         
        }else {
        return -1;
    }
    }
}
