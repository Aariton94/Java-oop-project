/**
 * Represents a United Stated retail channel.
 * Inherits from RetailChannel.
 */
public class USRetail extends RetailChannel {
    /**
     * Constructs a USRetail instance.
     * @param name          The name of the US Retail Channel.
     * @param location       The name of the location.
     * @param commissionRate The commission rate for the US Retail Channel.
     */
    public USRetail(String name,String location, double commissionRate) {
        super(name, location, commissionRate);

        System.out.println("Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("CommissionRate: " + getComissionRate());
        System.out.println();
    }


}
