package restaurant.src;

import java.util.ArrayList;

class Menu {
    public String[] items = {"Pizza", "Burger", "Pasta", "Salad", "Coke"};
    public int[] prices = {10, 5, 7, 4, 2};
}

class Order {
    public ArrayList<String> orderItems = new ArrayList<>();
    public int total = 0;
}

class Customer {
    public String name;

    public Customer(String name) {
        this.name = name;
    }
}

class Restaurant {}

class Payment {}
