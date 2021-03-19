import java.util.Scanner;

public class account {

    static double newAccountBalance;
    static double accountBalance = 0;
    static double withdraw;
    static double withdrawAccountBalance;
    
    public static double balance() {

        int password = 1234;
        

        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name);
        System.out.println("Please enter 4 digit pin: ");
        int pass = input.nextInt();

        if (password == pass) {

            System.out.println("Login Success!");
            System.out.println("Balance = " + accountBalance);
            System.out.println("Please choose options for next task");
            System.out.println("\n 1 - Update Balance \n 2 - Withdraw Balance");

            double taskChoice = input.nextDouble();

            if (taskChoice == 1) {

                System.out.println("How much would you like too put into your account");
                double cashIn = input.nextDouble();

                newAccountBalance = accountBalance + cashIn;

                System.out.println("Account successfull updated");
                System.out.println("Account Balance: " + newAccountBalance);

            } else {

                System.out.println("Account balance is: " + "$" + accountBalance + "\n How much would you like too withdraw");
                double cashOut = input.nextDouble();

                withdraw = accountBalance - cashOut;
                withdrawAccountBalance = withdraw;

                if (withdraw < 0) {

                    System.out.println("Funds withdrawn thank you for waiting \n You have successfully withdrawn: " + withdraw);
                    System.out.println("Account balance: " + "$" + withdrawAccountBalance);

                } else {

                    System.out.println("Insufficient funds. system has automatically logged you off");
                    
                }

              

            }


        } else {

            System.out.println("Incorrect password please restart system and try again");
        }

        return newAccountBalance;

    }

    public static double newAccountBalance() {

        System.out.println(newAccountBalance);
        return newAccountBalance;
    }

}
