import java.text.DecimalFormat;
import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {

        //! Defining an instance of the CafeUtil
        CafeUtil store1 = new CafeUtil();

        //! A class that I used to format the decimal places within my print statement
        DecimalFormat formatter = new DecimalFormat("#." + "0".repeat(2));
        
        //! Instantiating Item objects
        Item mocha = new Item("Mocha", 3.5);
        System.out.println(mocha.getName());

        Item latte = new Item("Latte", 4.5);
        System.out.println(latte.getName());


        Item coffee = new Item("Drip Coffee", 2.0);
        System.out.println(coffee.getName());

        Item cappiccino = new Item("Cappiccino", 5.0);
        System.out.println(cappiccino.getName());

        //! Member Variable test print
        // System.out.println(mocha.name);
        // System.out.println(latte.name);
        // System.out.println(coffee.name);
        // System.out.println(cappiccino.name);

        //! Instantiating Order objects
        //? formatter.format() converts the double to a string, so you have to adjust when concatenating.
        Order order1 = new Order();
        System.out.println(order1.getIsReady());
        System.out.println(order1.getName());
        order1.setName("Big Jon Griggs");
        System.out.println(order1.getName());
        ArrayList<Object> items = order1.getItems();
        if(items.isEmpty()) {
            System.out.println("Yeah, it is empty!");
        }
        else {
            System.out.println("No, it is not empty!");
        }

        if(items == null) {
            System.out.println("Yeah, it is null too :(");
        }
        else {
            System.out.println("You Good!");
        }


        // Order order1 = new Order();
        // order1.name = "Cindhuri";
        // order1.isReady = true;
        // System.out.printf("Order 1's Total: %s \n", formatter.format(order1.total));



        // Order order2 = new Order();
        // order2.name = "Jimmy";
        // order2.items.add(mocha);
        // order2.isReady = true;
        // System.out.printf("Order 2's Total: %s \n", formatter.format(order2.total));



        // Order order3 = new Order();
        // order3.name = "Noah";
        // order3.items.add(cappiccino);
        // System.out.printf("Order 3's Total: %s \n", formatter.format(order3.total));



        // Order order4 = new Order();
        // order4.name = "Sam";
        // order4.items.add(latte);
        // order4.items.add(latte);
        // order4.items.add(latte);
        // System.out.printf("Order 4's Total: %s \n", formatter.format(order4.total));
    }
}
