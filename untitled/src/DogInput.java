/*
    Program used to get a dog's age, weight and name
    Will compute dog age in dog years
    Will give teh user the computed results
 */
import java.util.Scanner;
public class DogInput {
    public static void main(String[] args) {
        System.out.println("Meeting 2 Week 3");

        //Create a new scanner object
        Scanner userInput = new Scanner(System.in);
        //Ask the question about the name
        System.out.println("What's the pet's name? ");
        String petName = userInput.next();
        System.out.println("What's the pet's age? ");
        int petAge = userInput.nextInt();
        System.out.println("What's the pet's weight? ");
        double petWeight = userInput.nextDouble();
        //Specify the pet's weight in double variable
        //Print what's in the variables
        System.out.println("Pet name: " + petName);
        System.out.println("Pet age: " + petAge);
        System.out.println("Pet weight: " + petWeight + " lbs");

        //Compute the dog's human years to dog years human years x 7
        //petAge = petAge * 7 ;
        //Create new int variable to hold the pet age conversion
        int petAgeInDogYears = petAge * 7;
        System.out.println("Pet age in dog years: " + petAgeInDogYears);


    }//ends main method/driver
}
