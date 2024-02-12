/*
    Ask a user for their first name
    Print it out
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    System.out.println("We are at week 3");

    //Create a variable that will hold the user's name
    String name;
    //Create a new Scanner object, so that I can get input from the user
    Scanner input = new Scanner(System.in);
    // ask the user what's their first name using a print statement
    System.out.print("What's your first name? ");
    name = input.nextLine();

    //Print out the user's input using the name variable
    System.out.println(name);

    //Print out the name using string literals/concatenation
    System.out.println("You entered:"+name);

    //Create a variable to hold the favorite color
    String color;
    //Ask the user's favorite color
    System.out.print("What's your favorite color");
    color = input.nextLine();
    //Print out the color using string literals/concatenation
    System.out.println("You entered:"+color);





    }//ends main method
}//ends Main class