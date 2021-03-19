import java.util.Scanner;


// Connect to a brokerage by getting your API Key and input it into Java Program 
public class api {
    
    public void apiKey() {
        String key = "ENTER_YOUR_KEY";
        String base_url = "https://paper-api.alpaca.markets";

        Scanner input = new Scanner(System.in);
        System.out.println(key);
        String myKey = input.nextLine();
        System.out.println("Entered Key is: " + myKey);
        System.out.println("Base Url: " + base_url);

    }
}