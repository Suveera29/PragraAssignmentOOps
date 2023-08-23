public class Main{
    public static void main(String[] args) {
        BankAcount bankAcount = new BankAcount() {
            @Override
            public double performTransaction(double money) {

                return money;
            }

            @Override
            public void logTransaction() {

            }

            @Override
            public void gettransactionHistory() {

            }
        };
    }
}