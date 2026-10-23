package problem2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("My Bank");

        System.out.println(bank.addCustomer("Abdelilah"));
        System.out.println(bank.addCustomer("Abdelilah"));
        bank.addCustomer("Sara");

        bank.addTransaction("Abdelilah", 1000.0);
        bank.addTransaction("Abdelilah", -250.5);
        bank.addTransaction("Abdelilah", 300);
        bank.addTransaction("Sara", 500);

        System.out.println(bank.addTransaction("Unknown", 100));

        bank.printStatement("Abdelilah");
        bank.printStatement("Sara");
        bank.printStatement("Unknown");
    }
}
