import java.util.Scanner;

public class AddressBook {
    Scanner details = new Scanner(System.in);
    Scanner details1 = new Scanner(System.in);
    Scanner details2 = new Scanner(System.in);
    Scanner details3 = new Scanner(System.in);
    Scanner details4 = new Scanner(System.in);
    Scanner details5 = new Scanner(System.in);
    Scanner details6 = new Scanner(System.in);
    Scanner details7 = new Scanner(System.in);
    Scanner details8 = new Scanner(System.in);


    public void addNewContact() {
        System.out.println("Enter the First Name :");
        contact.setFirstName(details1.next());
        System.out.println("Enter the Last Name :");
        contact.setLastName(details2.next());
        System.out.println("Enter the Address :");
        contact.setAddress(details3.next());
        System.out.println("Enter the City :");
        contact.setCity(details4.next());
        System.out.println("Enter the State :");
        contact.setState(details5.next());
        System.out.println("Enter the Pin Code :");
        contact.setPinCode(details6.next());
        System.out.println("Enter the Phone Number :");
        contact.setPhoneNum(details7.next());
        System.out.println("Enter the EMail ID :");
        contact.setEmail(details8.next());
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

    public void editContact() {
        System.out.println("Enter the First Name : ");
        String firstName = details1.next();

        if (firstName.equalsIgnoreCase(contact.getFirstName())) {
            System.out.println("The Entered Name is Not in the Address Book");
        } else {

            System.out.println("Enter the Last Name :");
            contact.setLastName(details2.next());
            System.out.println("Enter the Address :");
            contact.setAddress(details3.next());
            System.out.println("Enter the City :");
            contact.setCity(details4.next());
            System.out.println("Enter the State :");
            contact.setState(details5.next());
            System.out.println("Enter the Pin Code :");
            contact.setPinCode(details6.next());
            System.out.println("Enter the Phone Number :");
            contact.setPhoneNum(details7.next());
            System.out.println("Enter the EMail ID :");
            contact.setEmail(details8.next());
        }
    }
}
