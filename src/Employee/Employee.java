package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        int ch;
        Scanner scanner =new Scanner(System.in);
        ArrayList<String> emplist=new ArrayList<>();
        String empname;
        while(true)
        {
            System.out.println("Select an option");
            System.out.println("1.Add Employee");
            System.out.println("2.View Employee");
            System.out.println("3.Exit");
            ch=scanner.nextInt();
            switch (ch)
            {
                case 1:
                    empname=scanner.next();
                    emplist.add(empname);
                    break;
                case 2:
                    if(emplist.size()==0){
                        System.out.println("no employee");}
                    else {
                        System.out.println(emplist);}
                    break;
                case 3:
                    System.exit(0);


            }
        }
    }
}