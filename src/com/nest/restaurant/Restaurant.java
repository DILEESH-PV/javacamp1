package com.nest.restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        int total = 0, quantity = 0, choice1, choice2,invoice;
        String name;
        ArrayList<String> foodItem = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();
        ArrayList<Integer> tquantity = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        FoodItems foodItems = new FoodItems(10, 15, 20, 50, 60);
        FoodItems takeAwayFood = new FoodItems(12, 18, 25, 55, 65);
        HashMap<String,String> map=new HashMap<>();
        ArrayList<String> transactionlist=new ArrayList<>();
        Random ra=new Random();
        while (true) {
            System.out.println("Select an option");
            System.out.println("1. Dine Inn");
            System.out.println("2. Take Away");
            System.out.println("3. View all transaction");
            System.out.println("4. EXIT");
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
                            tquantity.add(quantity);
                            price.add(10);
                            foodItem.add("Tea");
                            total += quantity * foodItems.getTea();
                            break;
                        case 2:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            price.add(15);
                            foodItem.add("Coffee");
                            total += quantity * foodItems.getCoffee();
                            break;
                        case 3:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            price.add(20);
                            foodItem.add("Juice");
                            total += quantity * foodItems.getJuice();
                            break;
                        case 4:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            price.add(50);
                            foodItem.add("Sandwich");
                            total += quantity * foodItems.getSandwich();
                            break;
                        case 5:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            price.add(60);
                            foodItem.add("Burger");
                            total += quantity * foodItems.getBurger();
                            break;
                        case 6:
                            System.out.println("enter name");
                            name= scanner.next();
                            for(int i=0;i<foodItem.size();i++) {
                                System.out.println(foodItem.get(i) + "   :   " + price.get(i) + "Rs  *" + tquantity.get(i));
                            }
                            System.out.println("Total Bill= "+total);
                            invoice= ra.nextInt(100);
                            System.out.println("Invoice Number= "+invoice);
                            foodItem.clear();
                            price.clear();
                            tquantity.clear();
                            map.put("Name",name);
                            map.put("Total",String.valueOf(total));
                            map.put("mode","Dine Inn");
                            map.put("Invoice",String.valueOf(invoice));
                            transactionlist.add(String.valueOf(map));
                            total=0;
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Please select a valid item");
                            break;
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
                            tquantity.add(quantity);
                            foodItem.add("Tea");
                            price.add(takeAwayFood.getTea());
                            total += quantity * takeAwayFood.getTea();
                            break;
                        case 2:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Coffee");
                            price.add(takeAwayFood.getCoffee());
                            total += quantity * takeAwayFood.getCoffee();
                            break;
                        case 3:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Juice");
                            price.add(takeAwayFood.getJuice());
                            total += quantity * takeAwayFood.getJuice();
                            break;
                        case 4:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Sandwich");
                            price.add(takeAwayFood.getSandwich());
                            total += quantity * takeAwayFood.getSandwich();
                            break;
                        case 5:
                            System.out.println("Ënter the quantity");
                            quantity = scanner.nextInt();
                            tquantity.add(quantity);
                            foodItem.add("Burger");
                            price.add(takeAwayFood.getBurger());
                            total += quantity * takeAwayFood.getBurger();
                            break;
                        case 6:
                            System.out.println("Enter your name");
                            name= scanner.next();
                            for(int i=0;i<foodItem.size();i++) {
                                System.out.println(foodItem.get(i) + "   :   " + price.get(i) + "Rs  *" + tquantity.get(i));
                            }
                            System.out.println("Total Bill= "+total);
                            invoice= ra.nextInt(100);
                            System.out.println("Invoice Number= "+invoice);
                            foodItem.clear();
                            price.clear();
                            tquantity.clear();
                            map.put("Name",name);
                            map.put("Total",String.valueOf(total));
                            map.put("mode","Take Away");
                            map.put("Invoice",String.valueOf(invoice));
                            transactionlist.add(String.valueOf(map));
                            total=0;
                            break;
                        case 7:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Please select an valid item");
                            break;
                    }break;
                case 3:
                    System.out.println("****** The Total Transaction is ******");
                    System.out.println(transactionlist);
                    break;
                    case 4:
                        System.exit(0);
                default:
                    System.out.println("Please a valid option");
                    break;
                }
            }
        }
    }