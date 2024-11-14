package com.lpa.autobox;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public boolean addCustomer(Customer customer) {
        Customer searchCustomer = findCustomer(customer.getCustomerName());
        if (searchCustomer != null) {
            System.out.println("Customer is already present in the bank");
            return false;
        } else {
            customers.add(customer);
            System.out.println("Customer added successfully");
            return true;
        }
    }

    public void addTransactionsToCustomer(Customer customer, Double amount) {
        Customer searchCustomer = findCustomer(customer.getCustomerName());
        if (searchCustomer != null) {
            searchCustomer.addTransactions(amount);
        } else {
            System.out.println("No customer found with that name!!!");
        }
        return;
    }

    public void printStatement(Customer customer) {
        Customer searchCustomer = findCustomer(customer.getCustomerName());
        var transactionList = searchCustomer.getTransactions();
        System.out.println("-".repeat(20));
        System.out.println("The customer : " + searchCustomer.getCustomerName() + " with transaction amounts are: ");
        for (double val : transactionList) {
            System.out.printf("$10.2f (%s)%n", val, val < 0 ? "debit" : "credit");
        }
    }

    private Customer findCustomer(String customerName) {
        for (Customer customer : customers) {
            if (customer.getCustomerName().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
