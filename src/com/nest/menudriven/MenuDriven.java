package com.nest.menudriven;


import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        int choice;
        Scanner scanner=new Scanner(System.in);
        while (true)
        {
            System.out.println("Select an option");
            System.out.println("1.Add student");
            System.out.println("2.Search student");
            System.out.println("3.Delete student");
            System.out.println("4.View all student");
            System.out.println("5.Exit");

            choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Add student selected");
                    break;
                case 2:
                    System.out.println("search student selected");
                    break;
                case 3:
                    System.out.println("delete student selected");
                    break;
                case 4:
                    System.out.println("View all student selected");
                    break;
                case 5:
                    System.exit(0);
            }

        }
    }
}