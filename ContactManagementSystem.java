package ContactManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ContactManagementSystem {

    private List<Contact> contacts;

    public ContactManagementSystem() {
        contacts = new ArrayList<>();
    }

    public void addContact(String name, String phoneNumber) {
        Contact contact = new Contact(name, phoneNumber);
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    public void displayContacts() {
        System.out.println("Contact List:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName());
            System.out.println("Phone Number: " + contact.getPhoneNumber());
            System.out.println("-------------------------");
        }
    }

}
