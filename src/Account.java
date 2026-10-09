public class Account {
    private String owner;
    private double balance;

    public Account(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public Account(String owner, double balance) {
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

        if (amount <= 0) {
            System.out.println("You can not deposit  Zero (0) Amount:");
            return;
        }
        balance += amount;
    }

    //To wiuthdraw the amount
    public void withdraw(double amount) {
        if(amount<=0)
        {
            System.out.println("Ammount to be withdraw must be greater than zero(0):");
        return;
        }

        if (amount < balance) {
            balance -= amount;
        } else {
            System.out.println(" You have insuffient balance ");
        }
    }

    @Override
        public String toString()
    {
        return "Owner of the account:"+owner+" and Balance: "+balance;
    }

}
