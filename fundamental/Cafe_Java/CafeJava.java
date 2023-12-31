public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = ", your total is $";

        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.5;
        double latte = 4.0;
        double cappuccino = 5.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";        
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;       
        boolean isReadyOrder2 = true; // Changed this order from true to false to test logic block
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;

    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        }
        else {
            System.out.println(customer1 + pendingMessage);
        }
        
        System.out.println(isReadyOrder3 );
        System.out.println(mochaPrice);

        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(customer1 + displayTotalMessage + cappuccino);
        }
        else {
            System.out.println(customer4 + pendingMessage + ", sorry");
        }

        System.out.println(customer2 + displayTotalMessage + (latte + latte));

        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + displayTotalMessage + (latte - dripCoffee));

        

    	// ** Your customer interaction print statements will go here ** //
    }
}
