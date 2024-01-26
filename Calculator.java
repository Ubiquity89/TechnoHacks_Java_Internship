import java.util.Scanner;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int n1= sc.nextInt();
        System.out.println("Enter 2nd number ");
        int n2= sc.nextInt();
        System.out.println("Enter any operation:\n 1:Addition 2:Substraction 3:Multiply 4:Division 5:Remainder ");
        int operator= sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println("Result is: "+ (n1+n2));
                break;
            
            case 2:
            System.out.println("Result is: "+ (n1-n2));
            break;
        
            case 3:
            System.out.println("Result is: "+ (n1*n2));
            break;

            case 4:
            if(n1>n2) {
            System.out.println("Result is: "+ (n1/n2));
            }
            else {
                System.out.println("Invalid");
            }
            break;

            case 5:
            if(n1>n2) {
                System.out.println("Result is: "+ (n1%n2));
                }
                else {
                    System.out.println("Invalid");
                }
                break;
                
            default:
            System.out.println("Enter a valid operator");
                break;
        }
    }
    
}

