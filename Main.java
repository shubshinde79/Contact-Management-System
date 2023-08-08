package ContactManagementSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        ContactManagementSystem cms = new ContactManagementSystem();

	        while (true) {
	            System.out.println("----- Contact Management System -----");
	            System.out.println("1. Add Contact");
	            System.out.println("2. Display Contacts");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Phone Number: ");
	                    String phoneNumber = scanner.nextLine();
	                    cms.addContact(name, phoneNumber);
	                    break;
	                case 2:
	                    cms.displayContacts();
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	}

}
