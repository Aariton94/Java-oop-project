/**
 * Represents an AsiaAndMiddleEast retail channel.
 * Inherits from RetailChannel.
 */
    public class AsiaAndMiddleEast extends RetailChannel {
        /**
         * Constructs an AsiaAndMiddleEast instance.
         *
         * @param name           The name of the retail channel.
         * @param location       The name of the location.
         * @param commissionRate The commission rate for the retail channel.
         */
        public AsiaAndMiddleEast(String name,String location, double commissionRate) {
            super(name,location, commissionRate);

            System.out.println("Name: " + getName());
            System.out.println("Location: " + getLocation());
            System.out.println("CommissionRate: " + getComissionRate());
            System.out.println();
        }

    }


