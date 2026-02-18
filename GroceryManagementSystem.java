import java.util.Scanner;

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

    Scanner input = new Scanner(System.in);

    String[] itemNames = new String[10];
    double[] itemPrices = new double[10];
    int[] itemStocks = new int[10];

      while (true) {

System.out.println("\n1.View Inventory ");
System.out.println("2.Restock Item ");
System.out.println("3.Exit ");
System.out.print("Choose an option: ");

 int choice = input.nextInt();
    input.nextLine(); 

    if (choice == 1) {
     printInventory(itemNames, itemPrices, itemStocks);
    }

    else if (choice == 2) {
     System.out.print("Enter item name: ");
     String target = input.nextLine();

     System.out.print("Enter amount: ");
     int amount = input.nextInt();

     restockItem(itemNames, itemStocks, target, amount);
    }

  else if (choice == 3) {
  break;
     }

 else {
     System.out.println("Invalid option.");
     }
}

input.close();
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
                                " | Stock: " + stocks[i]);
            }
        }
    }

    /**
     * Restocks a specific item in the inventory.
     * Searches for the target item name and adds the given amount
     * to its corresponding stock quantity.
     *
     * @param names  array of item names
     * @param stocks array of item stock quantities
     * @param target name of the item to restock
     * @param amount quantity to add to the stock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {

        boolean found = false;

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println(target + " successfully restocked. New stock: " + stocks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

}
