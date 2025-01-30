package com.project.service;
//me shtu dokumentimin
import com.project.entity.*;
import com.project.entity.*;

import java.util.List;

public interface FoodService {
     void addMenuItem(Menu item);
     void removeMenuItem(Menu item);
     void getAllMenuItems();
     void createOrder(Order order);
     void getAllOrders();
     void updateOrderStatus(Order order, String status);
     void createReservation(Reservation reservation);
     void getAllReservations();
     void makePayment(Payment payment);
     void addIngredient(String name, int quantity);
     void addSupply(String name, int quantity);
     List<Inventory> checkLowInventory(List<Inventory> inventoryList, int threshold);
     boolean searchMenuItem(String itemName);
}
