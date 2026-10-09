import java.util.ArrayList;

public class AccountRegister {
    private ArrayList<Account> accounts;
    //contructor for the AccountRegister

public AccountRegister()
{
    accounts=new ArrayList<>();
}

//To create a new account
    public Account creatAccount( String owner,double balance)
    {
        Account account= new Account(owner,balance);
        accounts.add(account);
        return account;
    }

    //To displat all  the accounts

    public void listofAccounts()
    {

        if(accounts.isEmpty())
        {
            System.out.println("No Account Exist ");
            return;
        }
        System.out.println("\n ********Here is list of All Accounts******");

        for(Account account:accounts)
        {
            System.out.println(accounts);
        }
    }
}
