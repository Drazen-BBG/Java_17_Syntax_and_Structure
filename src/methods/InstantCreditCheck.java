package methods;

import java.util.Scanner;

    /*
     * PASSING ARGUMENTS TO METHODS
     * Write an 'instant credit check' program that approves
     * anyone who makes more than $25,000 and has a credit score
     * of 700 or better. Reject all others.
     */
public class InstantCreditCheck {

    public static void main(String args[]){

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        notifyUser(qualified);

    }

    public static boolean isUserQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if (creditScore>=requiredCreditScore && salary >= requiredSalary){
            //System.out.println("Congrats! You've been approved!");
            return true;
        }else {
            //System.out.println("Sorry, you've been declined.");
            return false;
        }

    }

    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("Congrats! You have been approved");
        }else {
            System.out.println("Sorry. You've been declined.");
        }
    }
}