package decision_structures;

import java.util.Scanner;

    /*
     * IF-ELSE-IF
     * Display the letter grade for a student based on their test score.
     */
public class TestResults {

    public static void main(String[] args) {

        //Get the test score
        System.out.println("Enter your test score, is should be between 0-100:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        //Determine the letter grade
        char grade = 'X';
        
        if (score<60 && score>=0){
            grade = 'F';
        }else if (score<70 && score>=0){
            grade = 'D';
        }else if (score<80 && score>=0){
            grade = 'C';
        }else if (score<90 && score>=0){
            grade = 'B';
        }else if (score<=100 && score>=0){
            grade = 'A';
        }else{
            System.out.println("You input " + score + ", that is not a value between 0-100");
        }

        if (grade != 'X')
        System.out.println("Your grade is: " + grade);
    }
}