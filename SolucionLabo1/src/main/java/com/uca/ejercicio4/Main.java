package com.uca.ejercicio4;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int nPeople = 0;
        String finalString = "";

        do {
            try {
                nPeople = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas va a ingresar?"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "La información ingresada no se puede procesar, intenta de nuevo. \n\n(Solo se aceptan números. Ejemplo: '2')", "Error", 0);
            }
            if (nPeople == 0) {
                JOptionPane.showMessageDialog(null, "El 0 no es un valor válido!", "Error", 0);
            } else {
                break;
            }
        } while (true);

        Persona[] listOfPeople = new Persona[nPeople];

        for (int i = 0; i < nPeople; i++) {
            listOfPeople[i] = new Persona();
            listOfPeople[i].setName(JOptionPane.showInputDialog("Ingrese el nombre de la persona " + (1 + i)));
            do {
                try {
                    listOfPeople[i].setAge( Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona " + (1 + i))));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "La información ingresada no se puede procesar, intenta de nuevo. \n\n(Solo se aceptan números. Ejemplo: '2')", "Error", 0);
                }
                if (listOfPeople[i].getAge() < 0)
                    JOptionPane.showMessageDialog(null, "Los valores negativos no son validos", "Error", 0);
                else {break;}
            } while (true);
        }
        
        for (Persona persona : listOfPeople) {
            if(persona.getAge() >= 18)
            finalString += " - " + persona.getName() + "\t (" + persona.getAge() + ")\n";
        }
        
        JOptionPane.showMessageDialog(null, finalString, "Personas mayores de edad", JOptionPane.INFORMATION_MESSAGE);
                
    }

}
