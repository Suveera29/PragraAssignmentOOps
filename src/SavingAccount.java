public class SavingAccount extends BankAcount {
    public SavingAccount(String acccountHolderName, int accountnumber, double balance, double interestrates, double overdraftlimits) {
        super();
        this.interestrates = interestrates;
        this.overdraftlimits = overdraftlimits;
    }

    public double interestrates;
    public double overdraftlimits;

    public double getInterestrates(double interestrates) {
        return interestrates;
    }

    public double getOverdraftlimits(double overdraftlimits) {
        return overdraftlimits;
    }

    public void performTransactions(){

    }

    @Override
    public void logTransaction() {

    }

    @Override
    public void gettransactionHistory() {

    }

    @Override
    public double performTransaction(double money) {
        return money;
    }
}
