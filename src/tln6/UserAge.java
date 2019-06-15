package tln6;

import java.util.Scanner;

public class UserAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Enter Your age:");

        try {                                                 // exception iskljuchenija. keyword try
            userInput = scanner.nextInt();
        } catch (Exception ex) {                              // Exception is superclass. after TRY nado CATCH. Vse iskljuchenija mozno v odni skobki cherez
            System.out.println("You entered an invalid input!");
            return;
        } finally {
            System.out.println("Inside finally");              // FINALLY prints always if exception is false or true
        }                                                      // Kogda rabotaem s databases, vsegda nado close the connection


        if (userInput >= 18) {
            System.out.println("Adult");
        } else if (userInput >= 13) {
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }
    }
}
