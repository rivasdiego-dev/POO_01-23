package com.uca.ejercicio2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        var pass1 = new Password(20);
        String message = "";
        int option = 0;

        JOptionPane.showMessageDialog(null, pass1.getValue());
        pass1.setLength(12);

        do {
            message = "Tu contraseña ";
            pass1.generarPassword();
            
            JOptionPane.showMessageDialog(null, pass1.getValue());
            message += pass1.esFuerte() ? "sí es fuerte!!" : "no cumple con los requisitos para ser considerada fuerte";
            option = JOptionPane.showConfirmDialog(null, message + "\n\nDeseas intentarlo de nuevo?", "Estado de contraseña", JOptionPane.YES_NO_OPTION);

        }while (option != 1);

    }

}
