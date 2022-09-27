package com.nest.restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        int total = 0, quantity = 0, choice1, choice2;
        ArrayList<String> foodItem = new ArrayList<>();
        ArrayList<Integer> totalP = new ArrayList<>();
        ArrayList<Integer> tquantity = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        FoodItems foodItems = new FoodItems(10, 15, 20, 50, 60);
        FoodItems takeAwayFood = new FoodItems(12, 18, 25, 55, 65);
        while (true) {
            System.out.println("Select an option");
            System.out.println("1. Dine Inn");
            System.out.println("2. Take Away");
            System.out.println("3.EXIT");
            choice1 = scanner.nextInt();
            switch (choice1) {
                case 1:
                    System.out.println("Select an option in dine inn");
                    System.out.println("1.Tea                   10Rs");
                    System.out.println("2.Coffee                15Rs");
                    System.out.println("3.Juice                 20Rs");
                    System.out.println("4.Sandwich              50Rs");
                    System.out.println("5.Burger                60Rs");
                    System.out.println("6.****** GENERATE BILL *****");
                    System.out.println("7.EXIT                      ");
                    choice2=scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * foodItems.getTea();
                            break;
                        case 2:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * foodItems.getCoffee();
                            break;
                        case 3:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * foodItems.getJuice();
                            break;
                        case 4:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * foodItems.getSandwich();
                            break;
                        case 5:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * foodItems.getBurger();
                            break;
                        case 6:
                            System.out.println("Total Quantity= " + quantity);
                            System.out.println("Amount= " + total);
                            System.out.println("Thank you for visiting ");
                        case 7:
                            System.exit(0);
                            break;
                        default:

                            System.out.println("Please select a valid item");
                    }
                    break;
                case 2:
                    System.out.println("Select an option for Take away");
                    System.out.println("1.Tea                     12Rs");
                    System.out.println("2.Coffee                  20Rs");
                    System.out.println("3.Juice                   25Rs");
                    System.out.println("4.Sandwich                55Rs");
                    System.out.println("5.Burger                  65Rs");
                    System.out.println("6.******* GENERATE BILL ******");
                    System.out.println("7.EXIT                        ");
                    choice2=scanner.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * takeAwayFood.getTea();
                            break;
                        case 2:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * takeAwayFood.getCoffee();
                            break;
                        case 3:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * takeAwayFood.getJuice();
                            break;
                        case 4:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * takeAwayFood.getSandwich();
                            break;
                        case 5:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            total += quantity * takeAwayFood.getBurger();
                            break;
                        case 6:
                            System.out.println("Total Quantity= " + quantity);
                            System.out.println("Amount= " + total);
                            System.out.println("Thank you for visiting");
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Please select an valid item");
                    }break;
                case 3:System.exit(0);}
            }
        }
    }