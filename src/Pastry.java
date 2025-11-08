//type of menu item that stores type of pastry, is gluten free
public class Pastry extends MenuItems {
    private String type;
    private boolean isGlutenFree;

    public Pastry(String itemName, int itemNum, double price, String type, boolean isGlutenFree) {
        super(itemName, itemNum, price);
        this.type = type;
        this.isGlutenFree = isGlutenFree;
    }

    public String getType() {
        return type;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setType(String type) {
        if (type.equals("")) {
            throw new IllegalArgumentException("Pastry type cannot be empty!");
        }
        this.type = type;
    }

    public void setGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }

    @Override
    public String toString() {
        return super.toString() + " | Type: " + type + " | Gluten-Free: " + (isGlutenFree ? "Yes" : "No");
    }
}