package labo01.exa5;

import javax.swing.JOptionPane;


public class example3 {

    public static void main(String[] args) {
        
        Account myAccount = new Account("Diego Rivas");
        
        // Print Info
        System.out.println(myAccount.toString());
        
        // Good deposit
        myAccount.Deposit(Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a depositar")));
        System.out.println(myAccount.toString());
        
        // Bad deposit
        myAccount.Deposit(Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a depositar")));
        
        // Good Withdraw
        myAccount.Withdraw(Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a retirar")));
        System.out.println(myAccount.toString());
        
        // Bad Withdraw
        myAccount.Withdraw(Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad a retirar")));
        
    }

}