package com.project;

import com.project.entity.*;
import com.project.service.FoodService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Restaurant implements FoodService {
    private ArrayList<Menu> menu;
    private ArrayList<Order> orders;
    private ArrayList<Reservation> reservations;
    private ArrayList<Payment> payments;
    private ArrayList<Inventory> ingredientInventory;
    private ArrayList<Inventory> supplyInventory;
    private ArrayList<String> lowInventoryItems;

    public Restaurant() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.payments = new ArrayList<>();
        this.ingredientInventory = new ArrayList<>();
        this.supplyInventory = new ArrayList<>();
        this.lowInventoryItems = new ArrayList<>();
    }

    public void addMenuItem(Menu item) {
        menu.add(item);
    }

    public void removeMenuItem(Menu item) {
        menu.remove(item);
    }

    public void getAllMenuItems() {
        menu.stream()
                .forEach(menuItem -> System.out.println(menuItem.getName() + menuItem.getDescription() + menuItem.getPrice()));
    }

    public void createOrder(Order order) {
        orders.add(order);
    }

    public void getAllOrders() {
        orders.stream()
                .forEach(order -> System.out.println(order.getStatus() + order.getItems() + order.getTableNumber()));
    }

    public void updateOrderStatus(Order order, String status) {
        order.setStatus(status);
    }

    public void createReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void getAllReservations() {
        reservations.stream()
                .forEach(reservation -> System.out.println("Date: " + reservation.getDate() + "Time: " + reservation.getTime() +
                        "Number of guests: " + reservation.getNumberOfGuests() + "Special requests:" + reservation.getSpecialRequests()));
    }

    public void makePayment(Payment payment) {
        payments.add(payment);
    }

    public void addIngredient(String name, int quantity) {
        Inventory ingredient = new Inventory(name, quantity);
        ingredientInventory.add(ingredient);
    }

    public void addSupply(String name, int quantity) {
        Inventory supply = new Inventory(name, quantity);
        supplyInventory.add(supply);
    }

    public List<Inventory> checkLowInventory(List<Inventory> inventoryList, int threshold) {
        return inventoryList.stream()
                .filter(inventory -> inventory.getQuantity() < threshold)
                .collect(Collectors.toList());
    }

    public boolean searchMenuItem(String itemName) {
        return menu.stream()
                .anyMatch(menuItem -> menuItem.getName().equalsIgnoreCase(itemName));
    }


    public static void main(String[] args) {

        Menu item1 = new Menu("Cheeseburger", "Classic cheeseburger with fries", 9.99, true);
        Menu item2 = new Menu("Caesar Salad", "Fresh romaine lettuce with Caesar dressing", 7.99, true);
        Menu item3 = new Menu("Chocolate Cake", "Decadent chocolate cake with a rich ganache", 5.99, true);
        Restaurant RestaurantStaff = new Restaurant();
        RestaurantStaff.addMenuItem(item1);
        RestaurantStaff.addMenuItem(item2);
        RestaurantStaff.addMenuItem(item3);
        RestaurantStaff.getAllMenuItems();
        Order order1 = new Order(1);
        order1.addItem(item1);
        order1.addItem(item3);
        order1.addItem(item2);
        order1.getItems();

    }
}

/*
Menu Management: The system should allow restaurant owners or managers to create, update, and delete menu items, including pricing and availability. The system should also allow for categorization of menu items such as appetizers, entrees, desserts, etc.

Order Management: The system should allow servers or waitstaff to take orders from customers, assign orders to tables, and manage the status of orders. The system should also be able to generate order tickets for kitchen staff to fulfill orders.

Reservation Management: The system should allow customers to make reservations online or over the phone. The system should also allow restaurant staff to manage reservations, including assigning tables and recording customer preferences.

Payment Management: The system should allow for payment processing, including cash, credit card, or other payment methods. The system should also be able to generate receipts and track payment history.

Inventory Management: The system should be able to track inventory levels, including ingredients and supplies, and generate alerts when inventory levels are low.


Creating a Menu class to represent the restaurant's menu items, with attributes such as name, description, price, and availability.

Creating an Order class to represent customer orders, with attributes such as the menu items ordered, the table number, and the status of the order.

Creating a Reservation class to represent customer reservations, with attributes such as the date and time of the reservation, the number of guests, and any special requests.

Creating a Payment class to represent payment transactions, with attributes such as the payment method, the amount paid, and the date and time of the transaction.

Implementing methods to allow restaurant staff to manage menus, orders, reservations, and payments.
 */
