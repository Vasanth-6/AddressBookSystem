import java.util.Scanner;

public class AddressBook {
    Scanner details = new Scanner(System.in);


    public void addNewContact() {
        System.out.println("Enter the First Name :");
        contact.setFirstName(details.next());
        System.out.println("Enter the Last Name :");
        contact.setLastName(details.next());
        System.out.println("Enter the Address :");
        contact.setAddress(details.next());
        System.out.println("Enter the City :");
        contact.setCity(details.next());
        System.out.println("Enter the State :");
        contact.setState(details.next());
        System.out.println("Enter the Pin Code :");
        contact.setPinCode(details.next());
        System.out.println("Enter the Phone Number :");
        contact.setPhoneNum(details.next());
        System.out.println("Enter the EMail ID :");
        contact.setEmail(details.next());
    }

    public void ShowContact() {
        System.out.println("First Name : " + contact.getFirstName());
        System.out.println("Last Name : " + contact.getLastName());
        System.out.println("Address : " + contact.getAddress());
        System.out.println("City : " + contact.getCity());
        System.out.println("State : " + contact.getState());
        System.out.println("Pin Code : " + contact.getPinCode());
        System.out.println("Phone Number : " + contact.getPhoneNum());
        System.out.println("EMail ID : " + contact.getEmail());
    }
}
