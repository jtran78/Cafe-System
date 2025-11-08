//This class extends menu items superclass. Coffee type menu item with size and dairy selection.
public class Coffee extends MenuItems {
    private String size;
    private String dairyType;

    //constructor: item name, number, price, size, dairy type
    public Coffee(String itemName, int itemNum, double price, String size, String dairyType) {
        super(itemName, itemNum, price);
        this.size = size;
        this.dairyType = dairyType;
    }

    public String getSize() { 
        return this.size; 
    }

    public String getDairyType() { 
        return this.dairyType; 
    }

    public void setSize(String size) {
        if (size.equals("")) {
            throw new IllegalArgumentException("What size would you like for your coffee?");
        }
        this.size = size;
    }

    public void setDairyType(String dairyType) {
        if (dairyType.equals("")) {
            throw new IllegalArgumentException("What dairy type would you like in your coffee?");
        }
        this.dairyType = dairyType;
    }

    @Override
    public String toString() {
        return super.toString() + " | Size: " + this.getSize() + " | Dairy Type: " + this.getDairyType();
    }
}