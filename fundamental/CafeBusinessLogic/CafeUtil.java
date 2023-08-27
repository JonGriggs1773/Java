import java.util.ArrayList;

public class CafeUtil {
    

    public int getStreakGoal(int numOfWeeks) {
        int count = 0;
        for(int i = 1; i < numOfWeeks; i++) {
            count += i;
        }
        return count;
    }

    public double getOrderTotal(double[] price) {
        double total = 0;
        for(int i = 0; i < price.length; i++) {
            total += price[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        for(int i = 0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        String username = System.console().readLine();
        int numInLine = customers.size();
        System.out.printf("Hello %s! There are %d in front of you.", username, numInLine);
        customers.add(username);
        for(String people : customers) {
            System.out.println(people);
        }
    }
    
}
