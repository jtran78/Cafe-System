//this class storews item name, number, price
public class MenuItems {
    private String itemName;
    private int itemNum;
    private double price;

    public MenuItems(String itemName, int itemNum, double price) {
        if (itemName.equals("") || price <= 0) {
            throw new IllegalArgumentException("Invalid item details!");
        }
        this.itemName = itemName;
        this.itemNum = itemNum;
        this.price = price;
    }

    public String getItemName() { 
        return itemName; 
    }

    public int getItemNum() { 
        return itemNum; 
    }
    
    public double getPrice() { 
        return price; 
    }

    public void setItemName(String itemName) {
        if (itemName.equals("")) {
            throw new IllegalArgumentException("Item name cannot be empty!");
        }
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than zero!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return itemName + " | Item #: " + itemNum + " | $" + price;
    }
}