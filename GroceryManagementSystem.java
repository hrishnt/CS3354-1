/**
 * GroceryManagementSystem
 *
 * This program manages a grocery store inventory
 * using parallel arrays for item names, prices,
 * and stock quantities.
 *
 * CS3354 - Assignment 1
 */
public class GroceryManagementSystem {

    public static void main(String[] args) {

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
    }

    /**
     * Prints all items currently in the inventory.
     * Only prints items whose name is not null.
     *
     * @param names  array of item names
     * @param prices array of item prices
     * @param stocks array of item stock quantities
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        System.out.println("\n--- Inventory List ---");

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null) {
                System.out.println(
                        "Item: " + names[i] +
                        " | Price: $" + prices[i] +
                        " | Stock: " + stocks[i]
                );
            }
        }
    }
}
