package com.uca.ejercicio3;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int nProducts = 0;

        do {
            try {
                nProducts = Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos necesita?"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La información ingresada no se puede procesar, intenta de nuevo. \n\n(Solo se aceptan números. Ejemplo: '2')", "Error", 0);
            }
            if (nProducts == 0) {
                JOptionPane.showMessageDialog(null, "El 0 no es un valor válido!", "Error", 0);
            } else {
                break;
            }
        } while (true);

        Producto[] listOfProducts = new Producto[nProducts];

        for (int i = 0; i < nProducts; i++) {
            listOfProducts[i] = new Producto(JOptionPane.showInputDialog("Nombre del producto numero " + (i+1)), Double.parseDouble(JOptionPane.showInputDialog("Precio del producto numero " + (i+1))));
        }
        
        JOptionPane.showMessageDialog(null, "El total de tu compra es " + Total(listOfProducts), "Total de compra", JOptionPane.INFORMATION_MESSAGE);

    }
    /**
     * Function that sums all prices in an array of 'n' products
     * @param products Array containing products
     * @return Sum of prices of each product in the array
     */
    public static double Total(Producto[] products) {
        double total = 0;

        for (Producto product : products) {
            total += product.getPrice();
        }

        return total;
    }

}
