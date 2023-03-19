
package labo_01;

import java.util.Scanner;

public class calculator {
    private int num1, num2, operation;
    
    public calculator() {
        this.num1 = 0;
        this.num2 = 0;
        this.operation = 0;
    }
    
    public void start(){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora!\nEstas son las opciones:");
        System.out.println("""
                           1) Sumar 'a' y 'b'
                           2) Restar 'a' y 'b'
                           3) Multiplicar 'a' por 'b'
                           4) Dividir 'a' entre 'b' 
                           
                           Por favor, elige una opcion: """);
        
        try {
            while (this.operation < 1 || this.operation > 4) {                
                this.operation = user_input.nextInt();
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        
        System.out.println("Ingrese el numero 'a':\t");
        this.num1 = user_input.nextInt();
        System.out.println("Ingrese el numero 'b':\t");
        this.num2 = user_input.nextInt();
        
        System.out.println("El resultado de la operacion es: "+ this.give_result((operation - 1), num1, num2));
            
    }
    
    public int give_result(int _operation, int a, int b){
        int result = 0;
        
        this.num1 = a;
        this.num2 = b;
        
        switch (_operation) {
            case 0:
                result = a + b;
                break;
            case 1:
                result = a - b;
                break;
            case 2:
                result = a * b;
                break;
            case 3:
                result = a / b;
                break;
            default:
                throw new AssertionError();
        }
        
        return result;
    }
}
