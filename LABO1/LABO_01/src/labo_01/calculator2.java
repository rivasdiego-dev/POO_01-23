package labo_01;

import java.util.Scanner;

public class calculator2 {

    public calculator2() {
    }
    
    public void start() {
        var input = new Scanner(System.in);
        double num1, num2;
        int choice;
        
        do {
            System.out.println("""
                               Menu:
                               1. Suma
                               2. Resta
                               3. Multiplicacion
                               4. Division
                               5. Salir
                               
                               """);
            System.out.print("Ingresa una opcion (1-5): ");
            choice = input.nextInt();
            
            System.out.print("Ingresa el primer numero: ");
            num1 = input.nextDouble();
            System.out.print("Ingresa el segundo numero: ");
            num2 = input.nextDouble();
            
            switch (choice) {
                case 1:
                    
                    
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Programa finalizado con exito");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, intenta de nuevo.");
                    break;
            }
        } while (choice != 5);
        
        input.close();
    }
    
}
