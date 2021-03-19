import java.util.Scanner;

public class tradingSystem {

        double totalCost;
        double netCost;
    
    public static  void tradingSystemBot() {

        double profit;
        double totalCost;
        double totalProfit;
        //Main trading system user input

        Scanner input = new Scanner(System.in);
        System.out.println("Enter ticket symbol");
        String ticker = input.nextLine();

        Scanner doubleInput = new Scanner(System.in);

        System.out.println("Number of shares: ");
        double numOfShares = doubleInput.nextDouble();
        System.out.println("Number of shares bought: " + numOfShares);
        
        System.out.println("Input Buy Order at ($): ");
        double buyOrder = doubleInput.nextDouble();

        totalCost = numOfShares * buyOrder;

        System.out.println("Your total cost is: " + "$" + totalCost);

        System.out.println("The ticker " + "'" + ticker + "'" + " has been placed with a buy order at " + "'" + "$" + buyOrder + "'" + " !");

        totalCost = buyOrder * numOfShares;

        System.out.println("Please place a Price Target so the AI bot can execture a sell order automatically");
        double sellOrder = doubleInput.nextDouble();

        System.out.println("Please place a sell price if the share price is too fall negative (A Stop Loss)");
        double belowTraget = doubleInput.nextDouble();

        System.out.println("Your Price targets of " + "'" + "$" + sellOrder + "'" + " and sell order if shares fall below negative of " + "'" + "$" + belowTraget + "'" + " have been set");

        System.out.println("Would you like to make another order?");
        System.out.println("\n 1 - Yes \n 2 - No");

        //Scanner for int

        Scanner ans = new Scanner(System.in);

        int ans1 = ans.nextInt();

        //loop for the class function 

        profit = sellOrder - buyOrder;

        totalProfit = profit * numOfShares;


        if (ans1 == 1) {

            tradingSystem.tradingSystemBot();

        } else {

            System.out.println("Total profits when price target reached is: " + "$" + profit);
            System.out.println("Ticker Company: " + ticker);
            System.out.println("Buy price: " + "$" + buyOrder);
            System.out.println("Sell price: " + "$" + sellOrder);
            System.out.println("Stop Loss: " + "$" + belowTraget);
            System.out.println("Forecast Profit: " + "$" + totalProfit);

        }

    }

    public void systemCalcCost() {

        Scanner input = new Scanner(System.in);

        account balance = new account();
        System.out.println("The total cost is: " + totalCost);
        System.out.println("Account Balance: " + balance.newAccountBalance());

        netCost = account.newAccountBalance() - totalCost;

        System.out.println("Would you like too purchase");
        System.out.println("\n 1 - Yes \n 2 - No");

        int choice = input.nextInt();

        if (choice == 1) {

            System.out.println("Payment has gone through \n Successfull Transaction \n New Balance: " + "$" + netCost);
            System.out.println("");

        } else {

            System.out.println("Purchase has been cancelled");

        }

    }
}
