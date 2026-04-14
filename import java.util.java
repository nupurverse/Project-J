import java.util.Scanner;

class Contact {
    private String name;
    private String phone;

    Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    String getName() {
        return name;
    }

    String getPhone() {
        return phone;
    }
}

class Directory {
    private Contact[] contacts;
    private int count;

    Directory(int size) {
        contacts = new Contact[size];
        count = 0;
    }

    void addContact(String name, String phone) {
        if (count == contacts.length) {
            System.out.println("Directory is full!");
            return;
        }
        contacts[count++] = new Contact(name, phone);
        System.out.println("Contact added.");
    }

    void searchContact(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Contact Found:");
                System.out.println("Name: " + contacts[i].getName());
                System.out.println("Phone: " + contacts[i].getPhone());
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    void deleteContact(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getName().equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                count--;
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    void displayContacts() {
        if (count == 0) {
            System.out.println("No contacts available.");
            return;
        }

        System.out.println("Contact List:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " +
                contacts[i].getName() + " - " +
                contacts[i].getPhone());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory(10);

        // Testing
        directory.addContact("Rahul", "9876543210");
        directory.addContact("Priya", "8765432109");

        directory.displayContacts();

        directory.searchContact("rahul");

        directory.deleteContact("Rahul");

        directory.searchContact("Rahul");

        directory.displayContacts();
    }
}