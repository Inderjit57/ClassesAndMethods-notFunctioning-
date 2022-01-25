package Question2;

import java.util.Scanner;

public class CustomerService_MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CustomerService customerService = new CustomerService();

		// ENTER NAME
		System.out.println("Enter Name");
		customerService.name = sc.next();

		String newName = "";
		newName = customerService.getName();
		System.out.println("Entered name is: " + newName);

		//ENTER EMAIL
		System.out.println("Enter Email");
		customerService.email = sc.next();

		String newEmail = "";
		newEmail = customerService.getEmail();
		System.out.println("Entered Email is: " + newEmail);

		// ENTER ADDRESS
		System.out.println("Enter Address");
		customerService.address = "100 Queen Steert";

		String newAddress = "";
		newAddress = customerService.getAddress();
		System.out.println("Entered Address is: " + newAddress);

		// UPDATING NAME
		System.out.println("Enter New name:");
		customerService.updateName(sc.next());

		String updatedName = customerService.getName();
		System.out.println("Updated Name is: " + updatedName);

		// UPDATING EMAIL
		System.out.println("Enter new email");
		customerService.updateEmail(sc.next());

		String updatedEmail = customerService.getEmail();
		System.out.println("Updated Email is: " + updatedEmail);

		// UPDATING ADDRESS
		System.out.println("Enter new ADDRESS");
		customerService.updateAddress(sc.nextLine());

		String updatedAddress = customerService.getAddress();
		System.out.println("Updated Email is: " + updatedAddress);

	}
}
