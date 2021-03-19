public class mainSystem {

    public static void main(String[] args) {

        // Run all the classes objects in the main class
        account accountObject = new account();
        api apiObject = new api();
        tradingSystem tradingSystemObject = new tradingSystem();

        accountObject.balance();
        apiObject.apiKey();
        tradingSystemObject.tradingSystemBot();
        tradingSystemObject.systemCalcCost();


    }
}
