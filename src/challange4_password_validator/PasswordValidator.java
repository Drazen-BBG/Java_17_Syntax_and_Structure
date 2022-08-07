package challange4_password_validator;

    //Challenge Password Validator
    //Validate the complexity of a proposed password

    //Program Requirements

    //Given
    //Username: johndoe
    //Password: ABC_1234

    //Ask the user to provide
    //New password

    //Verify
    //At least 8 characters long
    //Contains an uppercase letter
    //Contains a special character
    //Does not contain the username (johndoe)
    //is not same as the old password (ABC_1234)

import java.util.Scanner;

public class PasswordValidator {

    static String username = "johndoe";
    static String oldPassWord = "ABC_1234";
    static String newPasswordString;
    static Scanner scanner = new Scanner(System.in);
    static int passwordMinLength = 8;

    static boolean lengthIsGood = false;
    static boolean hasUppercaseLetter = false;
    static boolean hasLowercaseLetter = false;
    static boolean hasSpecialCharacter = false;
    static boolean isEqualToUsername = false;
    static boolean isEqualToOldPassword = false;


    public static void main(String[] args) {
        boolean repeat = true;

        NotifyTheUser();

        do {
            AskForNewPassword();

            if (IsYourNewPasswordGood()){
                System.out.println("Your new password is:" + newPasswordString);
                System.out.println("Your new password is good, keep it safe");
                repeat = false;
            }else {
                System.out.println("Your new password is not good, try again");
            }
        }while (repeat);


    }

    private static void AskForNewPassword(){
        newPasswordString = scanner.next();
    }
    private static void NotifyTheUser() {
        System.out.println("");
        System.out.println("Your username is: " + username);
        System.out.println("Your old password is: " + oldPassWord);
        System.out.println("Your password has been compromised, you need to enter a new password which follows the rules below.");
        System.out.println("");
        System.out.println("Rules:");
        System.out.println("Must be eight characters long,");
        System.out.println("it needs to contain both uppercase and lowercase letter or letters,");
        System.out.println("it needs to contain a special character (!, @, #, $, %, ^, &, ?, +, -, *)");
        System.out.println("it cant contain your username: " + username + ",");
        System.out.println("and it can't be the same as old password: " + oldPassWord + "");
        System.out.println("Please enter your new password:");
    }

    private static boolean DoesItContainUpperCaseLetter() {

        String[] alphabetUpperCase = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        boolean containsUppercaseLetter = false;
        for (int i = 0; i < alphabetUpperCase.length; i++) {

            if (newPasswordString.contains(alphabetUpperCase[i])) {
                containsUppercaseLetter = true;
                break;
            } else {
                containsUppercaseLetter = false;
            }
        }
        return containsUppercaseLetter;
    }

    private static boolean DoesItContainLowerCaseLetter() {

        String[] alphabetLowerCase = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "z", "y"};
        boolean containsLowerCaseLetter = false;
        for (int i = 0; i < alphabetLowerCase.length; i++) {

            if (newPasswordString.contains(alphabetLowerCase[i])) {
                containsLowerCaseLetter = true;
                break;
            } else {
                containsLowerCaseLetter = false;
            }
        }
        return containsLowerCaseLetter;
    }

    private static boolean DoesItContainSpecialCharacter() {

        String[] specialCharacters = {"!", "@", "#", "$", "%", "^", "&", "?", "+", "-", "*"};
        boolean containsSpecialCharacter = false;
        for (int i = 0; i < specialCharacters.length; i++) {

            if (newPasswordString.contains(specialCharacters[i])) {
                containsSpecialCharacter = true;
                break;
            } else {
                containsSpecialCharacter = false;
            }
        }
        return containsSpecialCharacter;
    }

    private static boolean IsYourNewPasswordGood(){

        if (newPasswordString.length() >= passwordMinLength){
            lengthIsGood = true;
        }else {
            System.out.println("Your password is " + newPasswordString.length() + " characters long. It needs to be " + passwordMinLength + " long");
            lengthIsGood = false;
        }

        if (DoesItContainUpperCaseLetter()){
            hasUppercaseLetter = true;
        }else {
            System.out.println("Your password does not contain uppercase letter");
            hasUppercaseLetter = false;
        }

        if (DoesItContainLowerCaseLetter()){
            hasLowercaseLetter = true;
        }else {
            System.out.println("Your password does not contain lowercase letter");
            hasLowercaseLetter = false;
        }

        if (DoesItContainSpecialCharacter()){
            hasSpecialCharacter = true;
        }else {
            System.out.println("Your password does not contain a special character");
            hasSpecialCharacter = false;
        }

        if (!newPasswordString.equals(username)){
            isEqualToUsername = true;
        }else {
            System.out.println("Your password is same as your username, this is not allowed");
            isEqualToUsername = false;
        }

        if (!newPasswordString.equals(oldPassWord)){
            isEqualToOldPassword = true;
        }else {
            System.out.println("Your password is same as your old password, this is not allowed");
            isEqualToOldPassword = false;
        }

        return lengthIsGood && hasUppercaseLetter && hasLowercaseLetter && hasSpecialCharacter && isEqualToUsername && isEqualToOldPassword;
    }

    private static void ResetAllBooleans(){
        lengthIsGood = false;
        hasUppercaseLetter = false;
        hasLowercaseLetter = false;
        hasSpecialCharacter = false;
        isEqualToUsername = false;
        isEqualToOldPassword = false;

        lengthIsGood = false;
        hasUppercaseLetter = false;
        hasLowercaseLetter = false;
        hasSpecialCharacter = false;
        isEqualToUsername = false;
        isEqualToOldPassword = false;
    }
}
