public abstract class RetailChannel {
    private String name;
    private String location;
    private double comissionRate;

    /**
     * @param name
     * @param location
     * @param comissionRate
     */

    public RetailChannel(String name, String location, double comissionRate) {
        this.name = name;
        this.location = location;
        this.comissionRate = comissionRate;

    }
    // Get the name of the retail channel
    public String getName() {
        return name;
    }

    // Get the location of the retail channel
    public String getLocation() {
        return location;
    }

    // Get the commission rate for the retail channel
    public double getComissionRate() {
        return comissionRate;
    }

    // Calculate the total amount payable for an order

    public double calculateTotalAmount(Order order) {
        double commissionRate = getComissionRate();
        double totalAmount = order.getNumberOfItems() * order.getItemCost();
        double commission = totalAmount * commissionRate;
        return totalAmount + commission;
    }
}


