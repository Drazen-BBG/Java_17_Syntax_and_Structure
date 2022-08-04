package challange1_fill_in_the_blanks;

import java.util.Scanner;

public class FillInTheBlanks {

    public static void main(String[] args) {
        // Challenge: Create a fill-in-the-blanks story program
        //On a ADJECTIVE SEASON day, I drink a minimum of NUMBER cups of coffee

        //Program requirements

        //Ask the user to provide
        Scanner scanner = new Scanner(System.in);
        //1. Season of the year
        String seasonOfTheYear;
        System.out.println("What is your favorite season of the year?");
        seasonOfTheYear = scanner.next();
        //2. Whole number (Integer)
        int number;
        System.out.println("Tell me one whole number, don't exaggerate LOL.");
        number = scanner.nextInt();
        //3. Adjective
        String adjective;
        System.out.println("OK, now tell me one adjective.");
        adjective = scanner.next();

        //4. Store the inputs in variables
        // I did, in the lines above

        //5. Print a story by filling in the blanks with variables
        System.out.println("On a " + adjective + " " + seasonOfTheYear+ " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
