package com.uca.solucionparcial1.ejercicio1;

import javax.swing.JOptionPane;

public class SolucionParcial1Ejercicio1 {

    
    // Este es el main en el que invocaremos al metodo
    public static void main(String[] args) {

        // Creamos una variable para almacenar el numero que ingrese el usuario
        var new_number = JOptionPane.showInputDialog("Ingrese un número para verificar si es o no palíndrome");

        // Utilizamos el operador ternario para determinar el mensaje que se mostrara al usuario.
        // La condicion aplicada proviene de la llamada al metodo 'isPalindrome'.
        JOptionPane.showMessageDialog(null, isPalindrome(new_number) ? "Sí es palíndrome :)" : "No es palíndrome :(");
    }

    /*    
        Este es el metodo que recibe un numero y verifica
        si es palindrome.
        Lo trabajamos como String para
        poder iterarlo.
    
        Recordatorio : Los strings son arrays de chars
     */
    public static boolean isPalindrome(String number) {

        // Guardamos la longitud del número, o sea, cuantos
        // números hay.
        int number_length = number.length();

        // Utilizamos el metodo toCharArray() para hacer la
        // transformación.
        char number_as_array[] = number.toCharArray();

        // Creamos una nueva variable con la longitud del número
        // para almacenarlo al revés. 
        char number_reversed[] = new char[number_length];

        /*
            Este for lo utilizamos para darle vuelta a la palabra.
            
            El indice 'i' comienza en 0, y utilizamos 'number_length'
            para recorrer hacia atrás. Esto porque 'number_length' tiene
            un valor constante, por lo que si le restamos 'i', ira disminuyendo.
            
            Tendremos que sumarle uno cuando lo restemos, ya que usaremos 'number_length' como
            indice en los arreglos. 
        
            Esto, para evitar este error:
            Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index [n] out of bounds for length [m]
        
        
            Podemos ver la siguiente tabla, con 'number_length' teniendo
            un valor de 5, el número que se utiliza es 96778: 
            
            Iteracion   |   i   | number_length - (i+1) | number_as_array[i] | number_reversed[number_length - (i+1)] |
            ------------|-------|-----------------------|--------------------|----------------------------------------|
            Iteración 1 |   0   |           4           |         9          |                  8                     |
            Iteración 2 |   1   |           3           |         6          |                  7                     |
            Iteración 3 |   2   |           2           |         7          |                  7                     |
            Iteración 4 |   3   |           1           |         7          |                  6                     |
            Iteración 5 |   4   |           0           |         8          |                  9                     |
            ----------------------------------------------------------------------------------------------------------
         */
        for (int i = 0; i < number_length; i++)
            number_reversed[number_length - (i + 1)] = number_as_array[i];
        /*
            Este for lo utilizamos para evaluar cada uno de los caracteres de ambas palabras.
            
            En caso de que al menos uno ya no sea igual, significa que no es palíndrome. Por
            lo que inmediatamente retornamos falso, porque no tiene sentido seguir verificando
            los demás caracteres.
        
            En caso de que todas sean iguales, la instruccion 'if' no se ejecuta, y retornamos
            que sí son palíndromes.
         */
        for (int i = 0; i < number_length; i++)
            if (number_as_array[i] != number_reversed[i])
                return false;
        return true;
    }
}
