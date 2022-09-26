package Calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int choice,n1,n2,ans;
        Scanner scanner =new Scanner(System.in);
        while(true)
        {
            System.out.println("Select an option");
            System.out.println("1. Add 2 numbers");
            System.out.println("2. Subtract 2 numbers");
            System.out.println("3.Multiply 2 number");
            System.out.println("4. Divide 2 number");
            System.out.println("5. exit");

            choice=scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter 2 nos");
                    n1=scanner.nextInt();
                    n2=scanner.nextInt();
                    ans =n1+n2;
                    System.out.println("sum="+ans);
                    break;
                case 2:
                    System.out.println("Enter 2 nos");
                    n1=scanner.nextInt();
                    n2=scanner.nextInt();
                    ans =n1-n2;
                    System.out.println("sub="+ans);
                    break;
                case 3:
                    System.out.println("Enter 2 nos");
                    n1=scanner.nextInt();
                    n2=scanner.nextInt();
                    ans =n1*n2;
                    System.out.println("mul="+ans);
                    break;
                case 4:
                    System.out.println("Enter 2 nos");
                    n1=scanner.nextInt();
                    n2=scanner.nextInt();
                    try
                    {
                      ans =n1/n2;
                      System.out.println("div="+ans);
                    }catch(ArithmeticException e){
                        System.out.println("Division by zero");
                    }

                    break;
                case 5: System.exit(0);
            }}
    }
}