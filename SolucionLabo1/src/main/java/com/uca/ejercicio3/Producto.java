
package com.uca.ejercicio3;

public class Producto {
    private String name;
    private double price;

    // Constructores 
    public Producto() {
    }

    public Producto(String name, double price) {
        this.name = name;
        this.price = price;
    }    
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    // Getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    
    
            
}