public class SavingsAccount extends Account {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        }
    }

    // toString metodas
    @Override
    public String toString() {
        return "SavingsAccount{" + "id=" + getId() + ", balance=" + getBalance() + '}';
    }
}
