package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> item = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Integer> Quantity = new ArrayList<>();

            //Items for the convenience store
            item.add("Red-Hot Spicy Doritos");
            price.add(2.99);
            item.add("Cool Ranch Doritos");
            price.add(2.99);
            item.add("Coke");
            price.add(0.99);
            item.add("Diet Coke");
            price.add(0.99);
            item.add("Pepsi");
            price.add(0.99);
            item.add("Five Hour Energy");
            price.add(3.99);
            item.add("Sunflower Seeds");
            price.add(0.99);
            item.add("Peanuts");
            price.add(0.99);
            item.add("Mac Book Chargers");
            price.add(120.00);
            item.add("Dell Chargers");
            price.add(50.00);

            System.out.println("Welcome to the COBIS Convenience Store, where all");

            System.out.println("Items for sale are listed below: ");
            System.out.println("""
                    1 :  Red-Hot Spicy Doritos
                    2 :  Cool ranch Doritos
                    3 :  Coke
                    4 :  Diet Coke
                    5 :  Pepsi
                    6 :  Five Hour Energy
                    7 :  Sunflower seeds
                    8 :  Peanuts
                    9 :  Mac Book Chargers
                    10 : Dell Chargers""");

            Scanner info = new Scanner(System.in);

            String userResponse;
            StringBuilder output = new StringBuilder();
            double cartTotal;
            double Total = 0;

            //Assembling the cart
            System.out.println("Please enter your name, enter \"done\" when finished ");
            while (!(userResponse = info.nextLine()).equalsIgnoreCase("done")) {
                output.append(userResponse);
                cartTotal = 0;
                do {
                    System.out.println("Enter the item number of the product you would like to buy (type \"11\" when finished): ");

                    userResponse = info.nextLine();
                    for (String x: item) {
                        if (Integer.parseInt(userResponse) == (item.indexOf(x))) {
                            item.get(item.indexOf(x));
                            cartTotal += price.get(item.indexOf(x));
                            String product = item.get(Integer.parseInt(userResponse));
                            output.append("\n").append(product);
                            if (!cart.contains(userResponse)) {
                                cart.add(userResponse);
                                Quantity.add(1);
                            } else {
                                int indexNumber = cart.indexOf(userResponse);
                                Quantity.set(indexNumber, Quantity.get(indexNumber) + 1);
                            }
                            break;
                        }
                    }
                }
                while ((!userResponse.equalsIgnoreCase("11")));
                output.append(" \n \t\t\t").append(cartTotal).append("\n");
                Total += cartTotal;

                System.out.println("If store hours are between 7am - 10pm, enter the next customer name.(Type closed if the store is not currently open): ");
            }
            System.out.println("It is after operating hours, and the convenience store is now closed! ");

            System.out.println("\n" + "Receipts for the day:  \n  " + output);

            System.out.println("Amount accounted for inventory sold: ");
            System.out.println(" ");

            for (String quantity : cart) {

                System.out.println("Item Number " + quantity + ":" + " [" + Quantity.get(cart.indexOf(quantity)) + "]");
            }

            System.out.println(" ");
            System.out.println("Your total is: $" + Total);

        }
    }
