# Cafe-System
## Project Overview
The **Online Cafe System** is a simple Java-based application that simulates a cafe ordering and loyalty program system. It allows users to:

- View the cafe menu (Coffee, Tea, Pastry items)
- Add or remove items from a customer’s order
- Print a receipt of the order
- Create and manage customers
- Track loyalty points and rewards for each customer

This project demonstrates object-oriented programming principles including **inheritance, encapsulation, and composition**.

---

## Files in the Project

| File Name               | Description                                                                 |
|-------------------------|-----------------------------------------------------------------------------|
| `Cafe.java`             | The main class/interface for the cafe (if used for abstraction).           |
| `CafeImp.java`          | Implementation of the cafe system with main method and menu interactions.   |
| `MenuItems.java`        | Base class for all menu items (Coffee, Tea, Pastry).                        |
| `Coffee.java`           | Subclass of `MenuItems` representing coffee drinks.                        |
| `Tea.java`              | Subclass of `MenuItems` representing tea drinks.                           |
| `Pastry.java`           | Subclass of `MenuItems` representing pastries.                              |
| `Customer.java`         | Represents a customer, including their name, email, order, and loyalty info.|
| `Order.java`            | Stores a customer’s order, including items, total price, and loyalty points.|
| `LoyaltyProgram.java`   | Tracks customer loyalty points and rewards.                                 |

---

## Features

1. **Menu Management**  
   - Display a list of available drinks and pastries.
   - Support multiple types of items with custom properties (e.g., sugar level for tea, milk type for coffee, butter type for pastry).

2. **Order Management**  
   - Add items to an order.
   - Remove items from an order.
   - Calculate total price and loyalty points.

3. **Customer Management**  
   - Create new customers.
   - View all existing customers.
   - Associate each customer with their own order and loyalty program.

4. **Loyalty Program**  
   - Track points and rewards for each customer.
   - Points can be accumulated based on purchases.
  
   ## Future Enhancements

Add abstraction

Include more menu customization options.

