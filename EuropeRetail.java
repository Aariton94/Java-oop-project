/**
 * Represents a Europe retail channel.
 * Inherits from RetailChannel.
 */
public class EuropeRetail extends RetailChannel {
    /**
     * Constructs a EuropeRetail instance.
     *
     * @param name           The name of the retail channel.
     * @param location       The name of the location.
     * @param commissionRate The commission rate for the retail channel.
     */
    public EuropeRetail(String name,String location, double commissionRate) {
        super(name, location, commissionRate);

        System.out.println("Name: " + getName());
        System.out.println("Location: " + getLocation());
        System.out.println("CommissionRate: " + getComissionRate());
        System.out.println();

    }

}



