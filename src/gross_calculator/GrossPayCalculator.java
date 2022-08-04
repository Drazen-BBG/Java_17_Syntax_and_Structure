package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //Steps to implement gross calculator algorithms

        //1.Get the number of hours worked
        int hoursWorked = 0;
        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        hoursWorked = scanner.nextInt();

        //2.Get the hourly pay rate
        double payRate = 0d;
        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();
        scanner.close();

        //3.Multiply hours and pay rate
        double grossPay = hoursWorked * payRate;

        //4.Display result
        System.out.println("Your gross pay is: $" + grossPay);

    }
}
