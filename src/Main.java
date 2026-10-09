
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        AccountRegister register = new AccountRegister();

        boolean executeProgram = true;

        while (executeProgram) {

            System.out.println("\n****** Welcome ******");
            System.out.println("****** Bank Menu ******");
            System.out.println("1. Create Account");
            System.out.println("2. List Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");

            System.out.print("\nChoose an option: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    createAccount(input, register);
                    break;

                case 2:
                    register. listofAccounts();
                    break;

                case 3:
                    System.out.println(
                            "Deposit functionality not implemented yet."
                    );
                    break;

                case 4:
                    System.out.println(
                            "Withdrawal functionality not implemented yet."
                    );
                    break;

                case 5:
                    executeProgram = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please choose 1-5."
                    );
            }
        }

        input.close();
    }

    private static void createAccount(
            Scanner input,
            AccountRegister register) {

        System.out.print("Enter owner name: ");
        String owner = input.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();
        input.nextLine();

        register.creatAccount(owner, balance);

        System.out.println("Account created successfully.");
    }
}
