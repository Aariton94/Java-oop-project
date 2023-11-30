import java.util.ArrayList;

/**
 * Represents a TimeSpa, a luxury bath and body products' maker.
 */
public class TimeSpa {

    public static void main(String[] args) {

        // Create the ArrayList to store data
        ArrayList<Retailer> retailers = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();

        // USRetail, AsiaAndMiddleEast, EuropeRetail

        AsiaAndMiddleEast AM1 = new AsiaAndMiddleEast("Timespa Oils and Essences","France", 0.015);
        EuropeRetail EUR1 = new EuropeRetail("Timespa Oils and Essences","Canada", 0.02);
        USRetail USR1 = new USRetail("Timespa Oils and Essences","USA",0.03);

        // Create a minimum of 10 Medical and beauty retail companies
        Retailer medicalAndBeauty1 = new Retailer("Smith and Partners", 121, 753443422,
                                     "smith_partners@gmail.com", "Boulevard Saint-Germain, Lyon");
        Retailer medicalAndBeauty2 = new Retailer("John and Johnson", 122, 752543455,
                                     "john_johnson@gmail.com", "Rue du Faubourg Saint-Honoré, Paris");
        Retailer medicalAndBeauty3 = new Retailer("Schneider & Co.", 123, 787654321,
                                     "contact@schneiderco.com", "789 Oak Street, Chicago, IL");
        Retailer medicalAndBeauty4 = new Retailer("Leclerc Beauty", 124, 756789123,
                                     "info@leclercbeaute.com", "Avenue des Champs-Élysées, Paris");
        Retailer medicalAndBeauty5 = new Retailer("Beauty Essentials Inc.", 125, 721654987,
                                     "info@beautyessentials.com", "123 Main Street, New York");
        Retailer medicalAndBeauty6 = new Retailer("Cosmetic Shop SRL", 126, 787321654,
                                     "contact@cosmeticshop.com", "678 Redwood Street, Seattle, WA");
        Retailer medicalAndBeauty7 = new Retailer("London Beauty Ltd.", 127, 741852963,
                                     "info@londonbeauty.com", "Rue de la Paix, Paris");
        Retailer medicalAndBeauty8 = new Retailer("Miller Beauty ", 128, 769258147,
                                     "office@muellerbeauty.com", "8 Alford Street, Lyon");
        Retailer medicalAndBeauty9 = new Retailer("Beauty Parishioner SRL", 129, 752963741,
                                     "contact@beauteparisienne.com", "123 Maple Avenue, Toronto, ON");
        Retailer medicalAndBeauty10 = new Retailer("Glamour Beauty Boutique Inc.", 130, 754123789,
                                     "info@glamourbeauty.com", "456 Oak Avenue, Vancouver, BC");

        // Add retailers to the ArrayList
        retailers.add(medicalAndBeauty1);
        retailers.add(medicalAndBeauty2);
        retailers.add(medicalAndBeauty3);
        retailers.add(medicalAndBeauty4);
        retailers.add(medicalAndBeauty5);
        retailers.add(medicalAndBeauty6);
        retailers.add(medicalAndBeauty7);
        retailers.add(medicalAndBeauty8);
        retailers.add(medicalAndBeauty9);
        retailers.add(medicalAndBeauty10);



        // Create a minimum of 9 Product Order
        Order order1 = new Order("Shampoo","001", "Pr321", "Olive Oil based Shampoo",
                                 "100 ml", 10, 3.49);
        Order order2 = new Order("Shampoo","002", "Pr322", "Tea Tree and Lemon Shampoo for Oily hair",
                                 "100 ml", 5, 2.99);
        Order order3 = new Order("Shampoo","003", "Pr323", "Extra Moisturising Shampoo",
                                 "400 ml", 10, 6.00);
        Order order4 = new Order("Shampoo","004", "Pr324", "Rosemary and Lavender Shampoo for hair growth",
                                 "400 ml", 15, 4.99);
        Order order5 = new Order("Shampoo","005", "Pr325", "Sensitive Shampoo with Aloe",
                                 "1000 ml", 20, 6.99);
        Order order6 = new Order("Shampoo","006", "Pr326", "Cleansing shampoo with Lime and Lemon",
                                 "1000 ml", 25, 6.20);
        Order order7 = new Order("Shampoo","007", "Pr327", "Rose oil shampoo",
                                 "1000 ml", 5, 9.49);
        Order order8 = new Order("Shampoo","008", "Pr328", "Fresh Natural Shampoo without SLS",
                                 "1000 ml", 30, 9.49);
        Order order9 = new Order("Shampoo","009", "Pr329", "Dry Shampoo with Conditioner",
                                 "1000 ml", 40, 4.99);

        //Add orders to an ArrayList
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        orders.add(order7);
        orders.add(order8);
        orders.add(order9);

        // Calculate the total amount payable for the first order using the USRetail channel
        double totalAmount = USR1.calculateTotalAmount(order1);
        // Construct a string with the details of the first order
        String orderDetails1 = medicalAndBeauty1.getName() + ", " + medicalAndBeauty1.getAddress() + ", " +
                order1.getOrderNumber() + ", " + order1.getProductType() + " " + order1.getProductSize() + ", " +
                "Nos " + order1.getNumberOfItems() + ", $" + String.format("%.2f", totalAmount);
        // Display the details of the first order
        System.out.println(orderDetails1);

        // Calculate the total amount payable for the second order using the EURetail channel
        double totalAmount2 = EUR1.calculateTotalAmount(order2);
        // Construct a string with the details of the second order
        String orderDetails2 = medicalAndBeauty2.getName() + ", " + medicalAndBeauty2.getAddress() + ", " +
                order2.getOrderNumber() + ", " + order2.getProductType() + " " + order2.getProductSize() + ", " +
                "Nos " + order2.getNumberOfItems() + ", $" + String.format("%.2f", totalAmount2);
        // Display the details of the second order
        System.out.println(orderDetails2);

        // Calculate the total amount payable for the third order using the AsiaAndMiddleEastRetail channel
        double totalAmount3 = AM1.calculateTotalAmount(order3);
        // Construct a string with the details of the third order
        String orderDetails3 = medicalAndBeauty3.getName() + ", " + medicalAndBeauty3.getAddress() + ", " +
                order3.getOrderNumber() + ", " + order3.getProductType() + " " + order3.getProductSize() + ", " +
                "Nos " + order3.getNumberOfItems() + ", $" + String.format("%.2f", totalAmount3);
        // Display the details of the third order
        System.out.println(orderDetails3);
        System.out.println();


        // Define monthly profits based on the provided data
        int[][] profits = {
                {140, 120, 136, 122, 142, 138, 142, 151, 144, 120, 143, 147},
                {130, 122, 126, 122, 140, 181, 141, 128, 168, 122, 141, 148},
                {127, 131, 134, 124, 142, 158, 142, 165, 142, 121, 140, 154},
                {140, 127, 137, 125, 141, 138, 141, 154, 180, 123, 142, 139}
        };
        // Calculate the total profit for each year
        int[] totalProfits = new int[profits.length];
        for (int i = 0; i < profits.length; i++) {
            int total = 0;
            for (int j = 0; j < profits[i].length; j++) {
                total += profits[i][j];
            }
            totalProfits[i] = total;
        }

        // Display the total profit for each year or season
        for (int i = 0; i < totalProfits.length; i++) {
            System.out.println("Total profit for Year " + (i + 1) + ": " + totalProfits[i] + "$");
        }
        System.out.println();


// Calculate the average profit for each year or season
        double[] averageProfits = new double[totalProfits.length];
        for (int i = 0; i < totalProfits.length; i++) {
            averageProfits[i] = (double) totalProfits[i] / profits[i].length;
        }


// Compare monthly profits to yearly averages
        for (int year = 0; year < profits.length; year++) {
            for (int month = 0; month < profits[year].length; month++) {
                int monthlyProfit = profits[year][month];
                if (monthlyProfit > averageProfits[year]) {
                    System.out.println("-----------------");
                    System.out.println("Year " + (year + 1) + ", Month " + (month + 1)
                            + ": Profit for is higher than the average");
                }

            }
        }



    }
}






