import java.util.ArrayList;

/**
 * Represents an order for products.
 */
public class Order {
    private String product;
    private String orderID;
    private String orderNumber;
    private String productType;
    private String productSize;
    private int numberOfItems;
    private double itemCost;

    /**
     * Constructs an Order instance.
     * @param product The product type.
     * @param orderID    The business ID associated with the order.
     * @param orderNumber   The order number.
     * @param productType   The type of product in the order.
     * @param productSize   The size of the product.
     * @param numberOfItems The number of items in the order.
     * @param itemCost      The cost per item.
     */
    public Order(String product,String orderID, String orderNumber, String productType, String productSize, int numberOfItems, double itemCost) {
        this.product = product;
        this.orderID = orderID;
        this.orderNumber = orderNumber;
        this.productType = productType;
        this.productSize = productSize;
        this.numberOfItems = numberOfItems;
        this.itemCost = itemCost;

        System.out.println("Order Details for " + getProduct() +":");
        System.out.println("OrderID: " + getOrderID());
        System.out.println("OrderNumber: " + getOrderNumber());
        System.out.println("ProductType: " + getProductType());
        System.out.println("ProductSize: " + getProductSize());
        System.out.println("NumberOfItems: " + getNumberOfItems());
        System.out.println("ItemCost: " + getItemCost());
        System.out.println();

    }

    // Get the product type (Shampoo, bath oils, bath and shower creams, body oils, body moisturisers)
    public String getProduct(){return product;}
    // Get the order ID associated with the order
    public String getOrderID() {
        return orderID;
    }
    // Get the order number
    public String getOrderNumber() {
        return orderNumber;
    }
    // Get the type of product in the order
    public String getProductType() {
        return productType;
    }
    // Get the size of the product
    public String getProductSize() {
        return productSize;
    }
    // Get the number of items in the order
    public int getNumberOfItems() {
        return numberOfItems;
    }
    // Get the cost per item
    public double getItemCost() {
        return itemCost;
    }





}
