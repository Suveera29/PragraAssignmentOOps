public abstract class BankAcount implements TransactionLog {
    public BankAcount() {
        this.acccountHolderName = acccountHolderName;
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    public String acccountHolderName;
    public int accountnumber;

    public  double balance;

    public abstract double performTransaction(double moeny);
    static int newAccount(int account){
        return account;

    }


}
