package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();
        double tip = (((double) percent) / 100) * cost;
        double totalBill = tip + cost;
        double costBeforeTip = cost / people;
        double tipPerPerson = tip / people;
        double totalCostPerPerson = totalBill / people;


        // Learned how to round with string.format from https://www.javatpoint.com/two-decimal-places-java

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%" + "\n");
        result.append("Total tip: $" +  String.format("%.2f", tip) + "\n");
        result.append("Total Bill with tip: $" +  String.format("%.2f", totalBill) + "\n");
        result.append("Per person cost before tip: $" +  String.format("%.2f", costBeforeTip) + "\n");
        result.append("Tip per person: $" +  String.format("%.2f", tipPerPerson) + "\n");
        result.append("Total cost per person: $" +  String.format("%.2f", totalCostPerPerson) + "\n");
        result.append("-------------------------------\n"); 

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 6;
        int percent = 25;
        double cost = 52.27;
        String items = ""; 

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an item name or type -1 to finish:");
        String itemName = scan.nextLine();
        StringBuilder itemList = new StringBuilder(items);
        
        while (!itemName.equals("-1")) {
            itemList.append(itemName).append("\n");
            System.out.println("Enter an item name or type -1 to finish:");
            itemName = scan.nextLine();
        }

                             
        System.out.println(calculateTip(people,percent,cost,itemList.toString()));
    }
}
