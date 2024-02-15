package edu.ucalgary.oop;

public class Inquirer {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String message;

    public Inquirer(String firstName, String lastName, String phoneNumber, String message) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getServicesPhoneNum() {
        return phoneNumber;
    }

    public String getInfo() {
        return message;
    }
}
