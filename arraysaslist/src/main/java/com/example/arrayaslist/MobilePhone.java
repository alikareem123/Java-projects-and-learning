package com.example.arrayaslist;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact original, Contact updateContact) {
        for (Contact contact : myContacts) {
            if (contact.getName().equals(updateContact.getName())) {
                int index = findContact(original.getName());
                if (index >= 0) {
                    myContacts.set(index, updateContact);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        int ind = findContact(contact);
        if (ind != -1) {
            myContacts.remove(ind);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        int ind = findContact(name);
        Contact c = myContacts.get(ind);
        if (c != null) {
            return c;
        } else {
            return null;
        }
    }

    public void printContacts() {
        int i = 1;
        System.out.println("Contact List:");
        for (Contact contact : myContacts) {
            System.out.println(i + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
            i++;
        }
    }
}
