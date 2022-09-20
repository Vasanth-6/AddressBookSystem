import java.util.Scanner;

public class contact {

    public static String firstName;
    public static String lastName;
    public static String address;
    public static String city;
    public static String state;
    public static String pinCode;
    public static String phoneNum;
    public static String email;


    public static String getFirstName() {
        return firstName;
    }

    public static void setFirstName(String firstName) {
        contact.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        contact.lastName = lastName;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        contact.address = address;
    }

    public static String getCity() {
        return city;
    }

    public static void setCity(String city) {
        contact.city = city;
    }

    public static String getState() {
        return state;
    }

    public static void setState(String state) {
        contact.state = state;
    }

    public static String getPinCode(String pinCode) {
        return pinCode;
    }

    public static void setPinCode(String pinCode) {
        contact.pinCode = pinCode;
    }


    public static String getPhoneNum() {
        return phoneNum;
    }

    public static void setPhoneNum(String phoneNum) {
        contact.phoneNum = phoneNum;
    }

    public static String getEmail() {
        return email;
    }

    public static String getPinCode() {
        return pinCode;
    }

    public static void setEmail(String email) {
        contact.email = email;
    }


    Scanner detail = new Scanner(System.in);

    public void setContactDetails() {

        System.out.print(" Enter First Name : ");
        setFirstName(detail.nextLine());
        System.out.print(" Enter Last Name : ");
        setLastName(detail.nextLine());
        System.out.print(" Enter The Address : ");
        setAddress(detail.nextLine());
        System.out.print(" Enter The City : ");
        setCity(detail.nextLine());
        System.out.print(" Enter The State : ");
        setState(detail.nextLine());
        System.out.print(" Enter The PinCode : ");
        setPinCode(detail.nextLine());
        System.out.print(" Enter The Phone Number : ");
        setPhoneNum(detail.nextLine());
        System.out.print(" Enter The Email : ");
        setEmail(detail.nextLine());
    }
}
