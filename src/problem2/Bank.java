package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    private Customer findCustomer(String customerName) {
        for (Customer c : customers) {
            if (c.getName().equals(customerName)) {
                return c;
            }
        }
        return null;
    }

    public boolean addCustomer(String customerName) {
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName));
            return true;
        }
        return false;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer c = findCustomer(customerName);
        if (c != null) {
            c.addTransaction(amount);
            return true;
        }
        return false;
    }

    public void printStatement(String customerName) {
        Customer c = findCustomer(customerName);
        if (c == null) {
            System.out.println("Customer " + customerName + " not found.");
            return;
        }
        System.out.println("Bank: " + name);
        System.out.println("Customer: " + c.getName());
        double total = 0;
        for (Double t : c.getTransactions()) {
            double amount = t;
            total += amount;
            System.out.println(amount >= 0
                    ? "  Credit: " + amount
                    : "  Debit:  " + amount);
        }
        System.out.println("Balance: " + total);
    }
}