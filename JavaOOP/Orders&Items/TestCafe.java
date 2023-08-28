import java.text.DecimalFormat;

public class TestCafe {
    public static void main(String[] args) {

        //! Defining an instance of the CafeUtil, Item, and Order classes
        CafeUtil store1 = new CafeUtil();
        DecimalFormat formatter = new DecimalFormat("#." + "0".repeat(2));
        
        Item mocha = new Item();
        mocha.name = "Mocha";
        mocha.price = 3.5;


        Item latte = new Item();
        latte.name = "Latte";
        latte.price = 4.5;


        Item coffee = new Item();
        coffee.name = "Drip Coffee";
        coffee.price = 2.0;


        Item cappiccino = new Item();
        cappiccino.name = "Cappiccino";
        cappiccino.price = 5.0;


        //! Member Variable test print
        // System.out.println(mocha.name);
        // System.out.println(latte.name);
        // System.out.println(coffee.name);
        // System.out.println(cappiccino.name);

        //? formatter.format() converts the double to a string, so you have to adjust when concatenating.
        Order order1 = new Order();
        order1.name = "Cindhuri";
        order1.isReady = true;
        System.out.printf("Order 1's Total: %s \n", formatter.format(order1.total));



        Order order2 = new Order();
        order2.name = "Jimmy";
        order2.items.add(mocha);
        order2.total += mocha.price;
        order2.isReady = true;
        System.out.printf("Order 2's Total: %s \n", formatter.format(order2.total));



        Order order3 = new Order();
        order3.name = "Noah";
        order3.items.add(cappiccino);
        order3.total += cappiccino.price;
        System.out.printf("Order 3's Total: %s \n", formatter.format(order3.total));



        Order order4 = new Order();
        order4.name = "Sam";
        order4.items.add(latte);
        order4.items.add(latte);
        order4.items.add(latte);
        order4.total += latte.price * 3;
        System.out.printf("Order 4's Total: %s \n", formatter.format(order4.total));
    }
}
