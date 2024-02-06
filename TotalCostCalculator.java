public class TotalCostCalculator {
    public static void main(String[] args) {
        int quantity = 10; // Quantity of items
        double pricePerItem = 5.75; // Price per item

        double totalCost = calculateTotalCost(quantity, pricePerItem);

        System.out.println("Total cost of purchasing " + quantity + " items at $" + pricePerItem + " per item is: $" + totalCost);
    }

    public static double calculateTotalCost(int quantity, double pricePerItem) {
        // Total cost = quantity * pricePerItem
        return quantity * pricePerItem;
    }
}
