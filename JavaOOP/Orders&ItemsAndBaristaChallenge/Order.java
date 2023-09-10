import java.util.ArrayList;

public class Order {
    
    //? Member Variables
    private String name;
    private boolean isReady;
    private ArrayList<Object> items;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Object>();
    }

    public Order(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsReady() {
        return this.isReady;
    }

    public ArrayList<Object> getItems() {
        return this.items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsReady() {
        if(this.isReady == true) {
            this.isReady = false;
        } 
        else {
            this.isReady = true;
        }
    }
}
