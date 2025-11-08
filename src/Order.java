import javax.swing.JOptionPane;
//The order class stores menu items
//add items, remove items from the array
//Customer has order --> association
//customer uses an order
public class Order {
    private static final int MAX_ITEMS = 100;
    private MenuItems[] items;
    private int itemCount;
    private double totalPrice;
    private double loyaltyPoints;

    Order() {
        items = new MenuItems[MAX_ITEMS];
        itemCount = 0;
        totalPrice = 0;
        loyaltyPoints = 0;
    }

    public void addItem(MenuItems item) {
        if (itemCount >= MAX_ITEMS) {
            JOptionPane.showMessageDialog(null, "Order is full! Cannot add more items.");
            return;
        }
        items[itemCount] = item;
        itemCount++;
        totalPrice += item.getPrice();
        loyaltyPoints += item.getPrice() * 5;
        JOptionPane.showMessageDialog(null, item.getItemName() + " added to your order.");
    }

    public void removeItem(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemCount) {
            JOptionPane.showMessageDialog(null, "Invalid item index! Cannot remove.");
            return;
        }
        totalPrice -= items[itemIndex].getPrice();
        loyaltyPoints -= items[itemIndex].getPrice() * 5;
        for (int i = itemIndex; i < itemCount - 1; i++) {
            items[i] = items[i + 1];
        }
        items[itemCount - 1] = null;
        itemCount--;
        JOptionPane.showMessageDialog(null, "Item removed from your order.");
    }

    public void printOrder() {
        String receipt = "Order Details:\n";
        for (int i = 0; i < itemCount; i++) {
            receipt += (i + 1) + ". " + items[i].toString() + "\n";
        }
        receipt += "Total Price: $" + totalPrice + "\n" +
                   "Loyalty Points Earned: " + loyaltyPoints;
        JOptionPane.showMessageDialog(null, receipt);
    }
    // order to string
    @Override
    public String toString() {
        String orderSum = "\nOrder Details:\n";
        for (int i = 0; i < itemCount; i++){
        orderSum += (i +1) + " . " + items[i].toString() + '\n';
        }
        orderSum += "Total Price $" + String.format("%.2f",totalPrice) + "\n";
        orderSum += "Loyalty Points Earned: " + loyaltyPoints;
        return orderSum;
    }
}
