
 public class Main
{
    public class Account {
        private String owner;
        private double balance;

        public void Account(String owner) {
            this.owner = owner;
            this.balance = 0;
        }

        public void Account(String owner, double balance) {
            this.owner = owner;
            this.balance = balance;
        }

        public String getOwner() {
            return owner;
        }

        public double getBalance() {
            return balance;
        }

        public void desposit(double amount) {

            if (amount < 0) {
                System.out.println("You can deposit  Zero (0) Amount:");
            }
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount < balance) {
                balance -= amount;
            }
        }


    }

    public static void main(String[] args)
    {



        System.out.println("Börjar projectet");
    }
}