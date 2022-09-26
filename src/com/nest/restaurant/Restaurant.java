package com.nest.restaurant;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        int total=0,quantity=0,choice,ch;
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("Select an option");
            System.out.println("1. Tea  10Rs");
            System.out.println("2. Coffee  15Rs");
            System.out.println("3. Fresh Juice  50Rs");
            System.out.println("4. Burger  140Rs");
            System.out.println("5. Sandwich  110Rs");
            System.out.println("6.********  GENERATE BILL *********");
            System.out.println("7.Exit");
            choice= scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Ënter the quantity");
                    quantity = scanner.nextInt();
                    total += quantity * 10;
                    break;
                case 2:
                    System.out.println("Ënter the quantity");
                    quantity = scanner.nextInt();
                    total += quantity * 15;
                    break;
                case 3:
                    System.out.println("Ënter the quantity");
                    quantity = scanner.nextInt();
                    total += quantity * 50;
                    break;
                case 4:
                    System.out.println("Ënter the quantity");
                    quantity = scanner.nextInt();
                    total += quantity * 140;
                    break;
                case 5:
                    System.out.println("Ënter the quantity");
                    quantity = scanner.nextInt();
                    total += quantity * 110;
                    break;
                case 6:
                    System.out.println("Total Quantity= " + quantity);
                    System.out.println("Amount= " + total);
                    System.out.println("Thank you for visiting");
                    System.out.println("Do you want to purchase anything else? 1. yes/ 0.No");
                    ch=scanner.nextInt();
                    if(ch==1)
                    continue;
                    else
                        System.exit(0);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select a valid item");

            }     }
    }
}
