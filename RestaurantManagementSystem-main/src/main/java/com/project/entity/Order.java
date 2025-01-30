package com.project.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private ArrayList<Menu>items;
    private int tableNumber;
    private String status;

    public Order(int tableNumber) {
        this.items = new ArrayList<>();
        this.tableNumber = tableNumber;
        this.status = "Free";
    }

    public void addItem(Menu item) {
        items.add(item);
    }

    public List<Menu> getItems() {
        for (Menu item : items
             ) {
            System.out.println(item.getName());
        }
        return items;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}