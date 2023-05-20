/*
Question : Write a program to remove all the occurrences of 'a' from string s = "abcax".
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String RemovingLetter,FullLetter,FinalResult;
        int index = 0;

        System.out.println("Enter the character you want to delete.");
         RemovingLetter = sc.nextLine();

        System.out.println("Enter the letter.");
        FullLetter = sc.nextLine();

        System.out.println("Printing the final result ");
        FinalResult = FullLetter.replace(RemovingLetter,"");

        System.out.println(FinalResult);

    }
}
