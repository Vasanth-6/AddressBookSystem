import java.util.Scanner;

public class contact {

    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String pinCode;
    public String phoneNum;
    public String email;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode(String pinCode) {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }


    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
