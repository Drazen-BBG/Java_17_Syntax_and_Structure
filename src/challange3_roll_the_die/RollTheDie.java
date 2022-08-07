package challange3_roll_the_die;

//Challenge Roll the Die
//Travel the entire game board of 20 spaces withing 5 die rolls
//Random random = new Random();
//int die = random.nextInt(6) + 1;

//Program requirements
//Generate random number between 1 and 6 to represent die roll
//Tell the player which game space they are on and how many more spaces they have to go to win
//Repeat four times (five rolls total)
//If the player advances exactly 20 spaces withing five rolls, they win

//Output the result of the game

// Roll #1: You've rolled a 3. You are now on space 3 and have 17 more to go


import java.util.Random;
import java.util.Scanner;

public class RollTheDie {

    public static void main(String[] args) {

        boolean playAgain = true;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("");
            System.out.println("Welcome to the Roll the Die!");
            System.out.println("Let's play");

            System.out.println("Tell me how many spaces do you want your board to have?");
            int boardLength = scanner.nextInt();

            System.out.println("Tell me how many rolls you want to have?");
            int maxRolls = scanner.nextInt();
            int currentRoll = 0;
            Random random = new Random();
            int currentRandom = 0;

            for (int i = 0; i < maxRolls; i++) {
                System.out.println("Press 0 to roll the die");
                String rollAgain = scanner.next();

                if (rollAgain.equals("0")) {
                    currentRandom = random.nextInt(6) + 1;
                    currentRoll += currentRandom;

                    if (currentRoll < boardLength) {
                        System.out.println("Roll #" + (i + 1) + ": You've rolled a " + currentRandom + ". You are now on space " + currentRoll + " and you have " + (boardLength - currentRoll) + " more to go.");
                    } else if (currentRoll > boardLength) {
                        System.out.println("Roll #" + (i + 1) + ": You've rolled a " + currentRandom + ". You are now on space " + currentRoll + " so you went " + (currentRoll - boardLength) + " beyond the last space.");
                        i = (maxRolls - 1);
                    } else {
                        System.out.println("Roll #" + (i + 1) + ": You've rolled a " + currentRandom + ". You are now on space " + currentRoll + " and you made it.");
                        i = (maxRolls - 1);
                    }

                } else {
                    System.out.println("Invalid entry, try again.");
                    i--;
                }

                if (i == (maxRolls - 1)) {
                    if (currentRoll == boardLength) {
                        System.out.println("You WIN!!! Congrats!!!");
                    } else if (currentRoll > boardLength) {
                        System.out.println("You LOSE!!! You went " + (currentRoll - boardLength) + " spaces beyond the last board space.");
                    } else if (currentRoll < boardLength) {
                        System.out.println("You LOSE!!! You were short " + (boardLength - currentRoll) + " spaces to reach the last space.");
                    }
                }

            } //End of for loop

            System.out.println("");
            System.out.println("Do you want to play again?");
            System.out.println("If YES press 0, if NO press 1");
            String playAgainString = scanner.next();
            if (playAgainString.equals("0")) {
                playAgain = true;
            } else {
                playAgain = false;
                scanner.close();
                System.out.println("Thanks for playing, see you next time!!!");
            }

        }while (playAgain);
    }

}

