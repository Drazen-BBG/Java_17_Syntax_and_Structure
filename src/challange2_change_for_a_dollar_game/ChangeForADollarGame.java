package challange2_change_for_a_dollar_game;

    //Challenge2 Change for a dollar game!
    //This is what I know
    //A penny is worth 1 cent. A nickel is worth 5 cents. A dime is worth 10 cents. A quarter is worth 25 cents.

    // Ask the user to provide
    //Number of pennies
    //Number of nickels
    //Number of dimes
    //Number of quarters

    //Calculate and print
    //Count total value of the coins
    //Print message informing them if they won or lost - IF the change is equal $1 they win otherwise they lose the game
    //If they lost, let them know how much they were over or under $1

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {
        //1.Ask the user how many of each of those they want
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Welcome to Change for a Dollar game!!!");
        System.out.println("Your goal is to enter enough change to make exactly $1.00");


        System.out.println("Enter your number of pennies:");
        int numberOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickles:");
        int numberOfNickles = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numberOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numberOfQuarters = scanner.nextInt();

        //2.Program needs to know what is the worth of each of those coins

        double worthOfPennies = 0.01d * numberOfPennies;
        double worthOfNickles = 0.05d * numberOfNickles;
        double worthOfDimes = 0.1d * numberOfDimes;
        double worthOfQuarters = 0.25d * numberOfQuarters;

        //3.Do the math

        double result = worthOfPennies + worthOfNickles + worthOfDimes + worthOfQuarters;

        //4.Inform the player
        if (result == 1){
            System.out.println("Yeah! That's exactly $1.00! You win!!!");
        } else if (result > 1) {
            double overOneDollar = result - 1;
            System.out.println("You lose!!!");
            System.out.println("Your result is $" + result + " which is $" + overOneDollar + " more than you need");
        } else if (result < 1) {
            double underOneDollar = result - 1;
            System.out.println("You lose!!!");
            System.out.println("Your result is $" + result + " which is $" + underOneDollar + " less than you need");
        }else {
            System.out.println("Something went wrong!!!");
        }
    }
}
