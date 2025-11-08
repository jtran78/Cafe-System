
import javax.swing.JOptionPane;

public class CafeImp {
    private static final int MAX_CUSTOMERS = 50;
    private static Customer[] customers = new Customer[MAX_CUSTOMERS];
    private static int customerCount = 0;

    public static void main(String[] args) {
        MenuItems[] menu = new MenuItems[10];
        menu[0] = new Coffee("Latte", 1, 4.50, "Medium", "Whole Milk");
        menu[1] = new Tea("Green Tea", 2, 3.00, "Hot", "No Sugar");
        menu[2] = new Pastry("Croissant", 3, 2.50, "Butter", false);

        //String cafeName = "Online Cafe";
       // String cafeLocation = "Fairfax";
       // int points = 0;
       // double rewards = 0;
        Order order = new Order();
        LoyaltyProgram loyaltyProgram = new LoyaltyProgram();
        int choice = 0;

        do {
            try {
                choice = Integer.parseInt(JOptionPane.showInputDialog("**Online Cafe**\n\nChoose one of the following options:\n1. View Menu\n2. Add Item to Order\n3. Remove Item from Order\n4. Print Receipt\n5. Create Customer\n6. View All Customers\n7. Exit\n\nEnter your choice:"));
                switch (choice) {
                    case 1: // View Menu
                        String menuDisplay = "Cafe Menu:\n";
                        for (int i = 0; i < menu.length; i++) {
                            if (menu[i] != null) {
                                menuDisplay += (i + 1) + ". " + menu[i].toString() + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, menuDisplay);
                        break;

                    case 2: // Add Item to Order
                        int menuChoice = Integer.parseInt(JOptionPane.showInputDialog("Enter the item number to add:")) - 1;
                        if (menuChoice >= 0 && menuChoice < menu.length && menu[menuChoice] != null) {
                            order.addItem(menu[menuChoice]);
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid menu choice!");
                        }
                        break;

                    case 3: // Remove Item from Order
                        int removeChoice = Integer.parseInt(JOptionPane.showInputDialog("Enter the item number to remove:")) - 1;
                        order.removeItem(removeChoice);
                        break;

                    case 4: // Print Receipt
                        order.printOrder();
                        break;

                    case 5: // Create Customer
                        if (customerCount >= MAX_CUSTOMERS) {
                            JOptionPane.showMessageDialog(null, "Customer limit reached! Cannot add more customers.");
                            break;
                        }
                        String custName = JOptionPane.showInputDialog("Enter customer name:");
                        String custEmail = JOptionPane.showInputDialog("Enter customer email:");
                        int custNum = customerCount + 1;

                        //Order neworder1 = new Order(); //add comment here i dont think we need this because it is at the top of the class

                        customers[customerCount] = new Customer(custNum, custEmail, custName, order, loyaltyProgram); //adjusted
                        customerCount++;
                        //customers.setOrder(order); //association?? Customer has order, I dont think we need this?
                        JOptionPane.showMessageDialog(null, "Customer created successfully!");
                        break;

                    case 6: // View All Customers
                        String customerDisplay = "Customers:\n";
                        for (int i = 0; i < customerCount; i++) {
                            customerDisplay += customers[i].toString() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, customerDisplay);
                        break;

                    case 7: // Exit
                        JOptionPane.showMessageDialog(null, "Thank you for using Online Cafe. Have a great day!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Incorrect choice! Try again.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a number.");
            }
        } while (choice != 7);
    }
}