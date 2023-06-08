//*************************************************************************
//M5-Food.java
//Date: 02/13/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: Develop a Java application where starting with that day of the week, display
// a schedule for the food trucks and events for the remainder of the week (through Saturday)
// using switch statements
//*************************************************************************

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //declare variables
        int input;
        String SundayTruck1 = "Donut Truck", SundayTruck2 = "Sandwich Truck";
        String MondayTruck1 = "Salad Truck", MondayTruck2 = "Pizza Truck";
        String TuesdayTruck1 = "Pad Thai Truck", TuesdayTruck2 = "Vegan Truck";
        String WednesdayTruck1 = "Ice Cream Truck", WednesdayTruck2 = "Burger Truck";
        String ThursdayTruck1 = "Taco Truck", ThursdayTruck2 = "Waffle Truck";
        String FridayTruck1 = "Fried Chicken Truck", FridayTruck2 = "Poke Truck";
        String SaturdayTruck1 = "Fried Truck", SaturdayTruck2 = "Pork Truck";
        String TriviaTheme = "SPECIAL EVENT: Trivia Night (Toga Night)", KaraokeTheme = "SPECIAL EVENT: Karaoke Night (Ladies of the 80s)";

        //intro
        System.out.println("\nWelcome to Hello World.");
        System.out.println("\tWe are delighted you are interested in the food trucks coming to our park and our special events.");

        //get day input from user
        System.out.print("Please enter a day of the week (1 for Sunday, 2 for Monday, ...,7 for Saturday): ");
        input = scan.nextInt();

        //switch statement
        switch (input) {

            //cases if input is valid
            case 1,7 -> {

                System.out.println("\nFood trucks and events for the remainder of the week: ");

                switch (input) {
                        //1 = Sunday //Output Sunday-Saturday
                    case 1:
                        System.out.println("\n\tSunday Night:");
                        System.out.println("\t\t" + SundayTruck1);
                        System.out.println("\t\t" + SundayTruck2);

                        //2 = Monday //Output Monday-Saturday
                    case 2:
                        System.out.println("\n\tMonday Night:");
                        System.out.println("\t\t" + MondayTruck1);
                        System.out.println("\t\t" + MondayTruck2);
                        System.out.println("\t\t" + TriviaTheme);

                        //3 = Tuesday //Output Tuesday-Saturday
                    case 3:
                        System.out.println("\n\tTuesday Night:");
                        System.out.println("\t\t" + TuesdayTruck1);
                        System.out.println("\t\t" + TuesdayTruck2);

                        //4 = Wednesday //Output Wednesday-Saturday
                    case 4:
                        System.out.println("\n\tWednesday Night:");
                        System.out.println("\t\t" + WednesdayTruck1);
                        System.out.println("\t\t" + WednesdayTruck2);

                        //5 = Thursday //Output Thursday-Saturday
                    case 5:
                        System.out.println("\n\tThursday Night:");
                        System.out.println("\t\t" + ThursdayTruck1);
                        System.out.println("\t\t" + ThursdayTruck2);

                        //6 = Friday //Output Friday-Saturday
                    case 6:
                        System.out.println("\n\tFriday Night:");
                        System.out.println("\t\t" + FridayTruck1);
                        System.out.println("\t\t" + FridayTruck2);
                        System.out.println("\t\t" + KaraokeTheme);

                        // 7 = Saturday //Output just Saturday
                    case 7:
                        System.out.println("\n\tSaturday Night:");
                        System.out.println("\t\t" + SaturdayTruck1);
                        System.out.println("\t\t" + SaturdayTruck2);
                        break;
                }
            }
            //Output if input is invalid
            default -> System.out.println("\nYou have entered an invalid entry for a day. You should use 1-7.");
        }
    }
}