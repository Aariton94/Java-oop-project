import java.util.ArrayList;

/**
 * Represents a retailer that sells products.
 */
public class Retailer {
    private String name;
    private int businessID;
    private int phoneNumber;
    private String email;
    private String address;

    /**
     * Constructs a Retailer instance.
     *
     * @param name       The name of the retailer.
     * @param businessID The business ID of the retailer.
     * @param phoneNumber The phone number of the retailer.
     * @param email      The email address of the retailer.
     * @param address    The address of the retailer.
     */
    public Retailer(String name, int businessID, int phoneNumber, String email, String address) {

        this.name = name;
        this.businessID = businessID;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;

        System.out.println("Retailer Details:");
        System.out.println("Name: " + getName());
        System.out.println("BusinessID: " + getBusinessID());
        System.out.println("PhoneNumber: " + getPhoneNumber());
        System.out.println("Email: " + getEmail());
        System.out.println("Address: " + getAddress());
        System.out.println();
    }

    // Get the name of the retailer
    public String getName() {
        return name;
    }

    // Get the business ID of the retailer
    public Integer getBusinessID() {
        return businessID;
    }


    // Get the phone number of the retailer
    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    // Get the email address of the retailer
    public String getEmail() {
        return email;
    }

    // Get the address of the retailer
    public String getAddress() {
        return address;
    }


}
