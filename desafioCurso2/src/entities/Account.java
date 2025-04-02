package entities;

public class Account {

    private int number;
    private double balance;
    private String holder;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, double initialDeposit, String holder) {
        this.number = number;
        this.balance = balance;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5;
    }

    public String toString() {
        return "Account number: " + number + "\nHolder: " + holder + "\nBalance: " + String.format("%.2f", balance);
    }

}
