package problem2;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    // positive = credit
    //negative = debit
    public void addTransaction(double amount) {
        transactions.add(amount);
    }
}