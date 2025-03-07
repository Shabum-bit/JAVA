import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id = 0;
    private String name;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private ArrayList<Transaction> transactions;

    public Account() {
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
        this.transactions = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public String getName() {
        return this.name;
    }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        transactions.add(new Transaction('W', amount, this.balance, "Withdrawal"));
    }

    public void deposit(double amount) {
        this.balance += amount;
        transactions.add(new Transaction('D', amount, this.balance, "Deposit"));
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", name='" + name + '\'' + ", balance=" + balance + ", annualInterestRate=" + annualInterestRate + ", dateCreated=" + dateCreated + '}';
    }
}

