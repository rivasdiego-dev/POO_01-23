
package com.uca.ejercicio1;

public class Libro {
    private String isbn;
    private String title;
    private String author;
    private int numPages;

    public Libro(String isbn, String title, String author, int numPages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }
    
    public Libro (){}

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }
    
    @Override
    public String toString() {
        return "El libro con ISBN " + isbn + " creado por el autor " + author + " tiene " + numPages + " páginas";
    }
}