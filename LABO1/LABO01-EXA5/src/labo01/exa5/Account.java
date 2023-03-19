package labo01.exa5;

public class Account {

    private String owner;
    private double amount;

    // Constructors
    public Account(String owner, double amount) {
        this.owner = owner;
        this.amount = amount;
    }

    public Account(String owner) {
        this.owner = owner;
        this.amount = 0;
    }

    // Setters
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Getters
    public double getAmount() {
        return amount;
    }

    public String getOwner() {
        return owner;
    }

    // toString method
    @Override
    public String toString() {
        return "Account{owner=" + owner + ", amount=" + amount + "}";
    }

    // User Defined Methods
    public void Withdraw(double amount) {
        if (this.amount - amount < 0) {
            System.out.println("Error! Fondos insuficientes.");
            return;
        }

        this.amount -= amount;
        System.out.println("Transaccion realizada con exito.");
    }

    public void Deposit(double amount) {
        if (amount < 0) {
            System.out.println("Error! No puedes ingresar cantidades negativas.");
            return;
        }

        this.amount += amount;
        System.out.println("Transaccion realizada con exito.");
    }

}
