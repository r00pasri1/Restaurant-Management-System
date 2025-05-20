# RestaurantManagementSystem
 


## Overview

The Restaurant Management System is a Java-based application designed to streamline restaurant operations. It includes functionalities for managing menu items, orders, reservations, payments, and inventory. The system provides a user-friendly interface to handle daily tasks efficiently.

## Features

- **Menu Management:** Create, update, and delete menu items. Categorize items as appetizers, entrees, desserts, etc.
- **Order Management:** Take customer orders, assign them to tables, and manage their status. Generate order tickets for kitchen staff.
- **Reservation Management:** Allow customers to make reservations, manage them, and record customer preferences.
- **Payment Management:** Process payments through various methods and generate receipts. Track payment history.
- **Inventory Management:** Track inventory levels for ingredients and supplies. Generate alerts for low inventory.

## Installation

To run this project locally:

1. **Clone the repository:**

   ```bash
   git clone https://github.com/r00pasri1/Restaurant-Management-System.git
   
   cd Restaurant-Management-System

2. **Build the project using Maven:**

    ```bash
    ./mvnw clean install
    ```

3. **Run the application:**

    ```bash
    ./mvnw exec:java -Dexec.mainClass="com.project.Restaurant"
    ```
## Out Put
![output](https://github.com/user-attachments/assets/c65f1706-7b26-46b9-b237-171128a56879)

## Usage

The Restaurant class in the com.project package includes a main method that demonstrates how to use the system. You can:

- Add and remove menu items.
- Create and manage orders and reservations.
- Process payments and manage inventory.
