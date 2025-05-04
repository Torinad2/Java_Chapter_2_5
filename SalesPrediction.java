/**************************************************************************************************
 * Assignment: Sales Prediction                                                                   *
 *                                                                                                *
 * The East Coast sales division of a company generates 62 percent of total sales. Based on that  *
 * percentage, write a program that will predict how much the East Coast division will generate   *
 * if the company has $4.6 million in sales this year. Hint: Use the value 0.62 to represent      *
 * 62 percent.                                                                                    *
 **************************************************************************************************/

public class SalesPrediction {
    public static void main(String[] args) {

        /* ********************************************
         * Declare total sales and percentage         *
         **********************************************/
        double totalCompanySales = 4_600_000.00;
        double eastCoastSalesPercent = 0.62;

        /* ********************************************
         * Calculate East Coast division sales        *
         **********************************************/
        double eastCoastSales = totalCompanySales * eastCoastSalesPercent;

        /* ********************************************
         * Display total and East Coast sales         *
         **********************************************/
        System.out.println("Total Sales:         $" + totalCompanySales);
        System.out.println("East Coast Division: $" + eastCoastSales);

        /* ********************************************
         * Display developer credit                   *
         **********************************************/
        System.out.println("\nDeveloped by: Nikita Baiborodov");

        /* ********************************************
         * Exit the program                           *
         **********************************************/
        System.exit(0);
    }
}

