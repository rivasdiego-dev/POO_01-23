
package com.uca.ejercicio2;

import java.util.Random;

public class Password {
    
    private int length;
    private String value = "";
    private Random rand = new Random();
    // String to pick chars from 
    private final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
    
    // Constructor with specified length
    public Password(int length) {
        this.length = length;
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            this.value += (chars.charAt(index));
        }
    }
    // Default constructor with length = 8
    public Password() {
        this.length = 8;
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(chars.length());
            this.value += (chars.charAt(index));
        }
    }    
    
    // Getters
    public int getLength() {
        return length;
    }

    public String getValue() {
        return value;
    }
    
    // Setter
    public void setLength(int length) {
        this.length = length;
    }
    
    // Generate password method
    public void generarPassword(){
        this.value = "";
        for (int i = 0; i < this.length; i++) {
            int index = rand.nextInt(chars.length());
            this.value += (chars.charAt(index));
        }
    }
    
    // isStrong method
    public boolean esFuerte(){
        int lowercaseLetters = 0, capitalLetters = 0, digits = 0, misc = 0;
        
        
        for (int i = 0; i < this.value.length(); i++) {
            char c = this.value.charAt(i);
            
            if (Character.isUpperCase(c))
                capitalLetters++;
            else if (Character.isLowerCase(c))
                lowercaseLetters++;
            else if (Character.isDigit(c))
                digits++;
            else
                misc++;
            
        }
        
        return (capitalLetters >= 2 && lowercaseLetters >= 1 && digits >= 5);
    }
    
}