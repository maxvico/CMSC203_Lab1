/*
 * Class: CMSC203 
 * Program: Lab 1 - Task 2
 * Description: Driver class to test the Movie class data element and setter methods
 * Due: 09/28/2026
 * Platform/compiler: Eclipse IDE / Java SE
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Max Vico
 */

import java.util.Scanner;

public class MovieDriverTask2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String response;

        do {
            Movie newmovieobject = new Movie();

            System.out.println("Enter the title of a movie");
            String title = keyboard.nextLine();
            newmovieobject.setTitle(title);

            System.out.println("Enter the rating of the movie");
            String rating = keyboard.nextLine();
            newmovieobject.setRating(rating);

            System.out.println("Enter the number of tickets sold for this movie");
            int tickets = keyboard.nextInt();
            newmovieobject.setSoldTickets(tickets);

            System.out.println(newmovieobject.toString());

            // Clear the leftover newline character from nextInt()
            keyboard.nextLine();

            System.out.println("Do you want to enter another? (y or n)");
            response = keyboard.nextLine();

        } while (response.equalsIgnoreCase("y"));

        System.out.println("Goodbye");

        keyboard.close();
    }
}