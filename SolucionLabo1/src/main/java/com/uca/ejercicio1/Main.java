package com.uca.ejercicio1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("4J3249B1", "Los Juegos del Hambre", "Anónimo", 528);
        Libro libro2 = new Libro("HEI8WN37", "Cuentos de Hadas", "Christopher Garlkin", 132);
        Libro libro3 = new Libro("409N20C3", "Dragones", "Breghton Mauller", 824);
        
        showBook(libro1);
        showBook(libro2);
        showBook(libro3);
        
        compareBooks(libro1, libro2);
        compareBooks(libro1, libro3);
        compareBooks(libro2, libro3);       
    }

    /**
     * Calls the overwritten toString() method to show information about the book
     * @param book The book that will be displayed
     */
    public static void showBook(Libro book) {
        JOptionPane.showMessageDialog(null, book);
    }
    
    /**
     * Compares which book has more pages
     * @param bookA Book to compare
     * @param bookB Book to compare with
     */
    public static void compareBooks(Libro bookA, Libro bookB){
        String winner = bookA.getNumPages() > bookB.getNumPages() ? bookA.getTitle() : bookB.getTitle();
        String loser = bookA.getNumPages() < bookB.getNumPages() ? bookA.getTitle() : bookB.getTitle();
        
        JOptionPane.showMessageDialog(null, winner + " tiene más paginas que " + loser);      
    }
}
