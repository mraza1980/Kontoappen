
 public class Main
{
    public static class Account {
        private String owner;
        private double balance;

        public Account(String owner) {
            this.owner = owner;
            this.balance = 0;
        }

        public  Account(String owner, double balance) {
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

Account  firstObject= new  Account("johan",1000);

 System.out.println(firstObject.getOwner());



    }
}