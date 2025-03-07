public class Main {
    public static void main(String[] args) {

        Account account = new Account("George", 1122, 1000);

        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("Account Holder: " + account.getName());
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate() + "%");
        System.out.println("Balance: $" + account.getBalance());

        System.out.println("\nTransaction History:");
        for (Transaction t : account.getTransactions()) {
            System.out.printf("Date: %s, Type: %c, Amount: $%.2f, Balance: $%.2f, Description: %s%n",
                    t.getDate(), t.getType(), t.getAmount(), t.getBalance(), t.getDescription());
        }
    }
}

//        Account account = new Account(1122, 20000);
//        account.setAnnualInterestRate(4.5);
//        account.withdraw(2500);
//        account.deposit(3000);
//        System.out.println("Balance: " + account.getBalance());
//        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
//        System.out.println("Date Created: " + account.getDateCreated());
//
//        CheckingAccount checking = new CheckingAccount(1001, 5000, 500);
//        SavingsAccount savings = new SavingsAccount(1002, 10000);
//
//        System.out.println("\nAccount toString(): " + account.toString());
//        System.out.println("CheckingAccount toString(): " + checking.toString());
//        System.out.println("SavingsAccount toString(): " + savings.toString());


