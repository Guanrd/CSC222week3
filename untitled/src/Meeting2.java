/*
    File used in week3 meeting2 to learn new code
 */
public class Meeting2 {
    public static void main(String[] args) {
        System.out.println("Meeting 2 Week 3");
        //Specify the pet's name in String variable
        String petName = "Rover";
        //Specify the pet's age in int variable
        int petAge = 10;
        //Specify the pet's weight in double variable
        double petWeight = 39.5;
        //Print what's in the variables
        System.out.println("Pet name: " + petName);
        System.out.println("Pet age: " + petAge);
        System.out.println("Pet weight: " + petWeight);

        //Compute the dog's human years to dog years human years x 7
        //petAge = petAge * 7 ;
        //Create new int variable to hold the pet age conversion
        int petAgeInDogYears = petAge * 7;
        System.out.println("Pet age in dog years: " + petAgeInDogYears);


    }//ends main method/driver
}//ends Meeting2 class
