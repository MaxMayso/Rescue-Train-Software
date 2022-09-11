package Java_Programs.Grazioso_Salvare;

//importing arrayList and Scanner Modules Taking input and storing in Array Lists
import java.util.ArrayList; 
import java.util.Scanner;

public class Driver {
    //declaring Array Lists for Dogs and Monkeys
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> MonkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        
        //initializing Dog and Monkey lists
        initializedogList();
        initializeMonkeyList();

        //Initializing line String object for additional Scanning input
        Scanner scnr = new Scanner(System.in);
        String line = "";

        
        //Loop to take user input and use it to decide what the program will do ============================================================
        while(!line.equals("q")) {
            displayMenu();
            line = scnr.nextLine();
            if (line.equals("1")){
                System.out.println("You have chosen to enter a new dog to the team today.");
                intakeNewDog(scnr); //passing original scanner scnr
            }
            else if (line.equals("2")){
                System.out.println("You have chosen to enter a new monkey to the team today.");
                intakeNewApe(scnr);
            }
            else if (line.equals("3")){
                System.out.println("What animal would you like to reserve today? [Dog] or [Monkey]?");
                reserveAnimal(scnr);
            }
            else if (line.equals("4")){
                System.out.println("Now printing list of dogs.. ");
                printAnimals(line); //passing line scanner
            }
            else if (line.equals("5")){
                System.out.println("Now printing list of monkeys.. ");
                printAnimals(line);
            }
            else if (line.equals("6")){
                System.out.println("Now printing list of all animals that aren't reserved.. ");
                printAnimals(line);
            }
            else {
                System.out.println("\nInput not recognized, please try again.");
            }
        }

        System.out.println("Goodbye.");

    
    }



// Array List with Monkey types strings as the objects ==============================================================


    private static ArrayList<String> monkeyTypes = new ArrayList<String>();

    public static void monkeyTypeList() {
        monkeyTypes.add("Capuchin");
        monkeyTypes.add("Guenon");
        monkeyTypes.add("Macaque");
        monkeyTypes.add("Marmoset");
        monkeyTypes.add("Squirrel Monkey");
        monkeyTypes.add("Tamarin");

    }

    

// This method prints the menu options ===========================================================================


    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }




// initialize dog and monkey ======================================================================================
    
    public static void initializedogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    public static void initializeMonkeyList() {
        Monkey ape1 = new Monkey("George", "Male", "Monkey", "2", "75", "08-13-2020", "United States", "intake", true, "United States", "18", "4'1", "38", "Capuchin");
        Monkey ape2 = new Monkey("Mrs. Kong", "Female", "Monkey", "1", "57", "04-28-2021", "United States", "intake", false, "United States", "20", "3'2", "40", "Mormoset");

        MonkeyList.add(ape1);
        MonkeyList.add(ape2);
    }



    

// intake Dog and Monkey Methods =====================================================================================

    //Method that takes New dog information and creates a dog object to add to the array list 
    public static void intakeNewDog(Scanner scnr) {
        System.out.println("Please enter this dog's information please.\n\n");
        System.out.println("What is the dog's name?");
        String name = scnr.nextLine();
        for(Dog dog: dogList) { //Iterating through the Dogs in dogList Array Lists with Dog objects
            if(dog.getName().equalsIgnoreCase(name)) { //this is to stop there from entering a dog that is already in system
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }


        //Creating Dog for Dog array List

        Dog Dog1 = new Dog();

        //Saving tne name input as the Dog name 
        Scanner dogScan = new Scanner(System.in);
        Dog1.setName(name);

        //Prompting input for Dog Breed
        System.out.println("Please enter breed");
        String Breed = dogScan.nextLine();
        Dog1.setBreed(Breed);

        //Prompting input for Dog gender
        System.out.println("Please enter gender");     
        String Gender = dogScan.nextLine(); 
        Dog1.setGender(Gender);

        //Prompting input for Dog age
        System.out.println("Please enter age");        
        String Age = dogScan.nextLine();
        Dog1.setAge(Age);

        //Prompting input for Dog weight
        System.out.println("Please enter weight");
        String Weight = dogScan.nextLine(); 
        Dog1.setWeight(Weight);

        //Prompting input for Dog acquisition date
        System.out.println("Please enter date of acquisition");        
        String acDate = dogScan.nextLine();
        Dog1.setAcquisitionDate(acDate);

        //Prompting input for Dog acquistion place
        System.out.println("Please enter country where acquired");        
        String acPlace = dogScan.nextLine();
        Dog1.setAcquisitionLocation(acPlace);

        //prompting input for Dog training status
        System.out.println("Please enter training status");       
        String TrnST = dogScan.nextLine();
        Dog1.setTrainingStatus(TrnST);

        //Prompting input for Dog service country
        System.out.println("Please enter service country");        
        String serviceCountry = dogScan.nextLine();
        Dog1.setInServiceCountry(serviceCountry);
        //Done getting Dog parameters on Dog
      	
      	//Adding Dog object to array list
      	dogList.add(Dog1);
      	dogScan.close();

        
    }


    //Method that takes new monkey information and creates a monkey object to add to the array list

    public static void intakeNewApe(Scanner scnr) {
        System.out.println("Please enter this monkey's information please.\n\n");
        System.out.println("What is the monkey's name?");
        String name = scnr.nextLine();
        for(Monkey Ape1: MonkeyList) { //iterating through Monkey Array List with Monkey object
            if(Ape1.getName().equalsIgnoreCase(name)) { //if already in the system it rejects the monkey name
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to prompt for user input
            }
        }

        //Create Monkey for monkey array list
        Monkey Ape1 = new Monkey();

        //Saving the name input as the Monkey Name
        Scanner apeScan = new Scanner(System.in);
        Ape1.setName(name);

        //Prompting input for Monkey gender
        System.out.println("Please enter gender");     
        String Gender = apeScan.nextLine(); 
        Ape1.setGender(Gender);

        //Prompting input for Monkey age
        System.out.println("Please enter age");        
        String Age = apeScan.nextLine();
        Ape1.setAge(Age);

        //Prompting input for Monkey weight
        System.out.println("Please enter weight");
        String Weight = apeScan.nextLine(); 
        Ape1.setWeight(Weight);

        //Prompting input for Monkey acquisition date
        System.out.println("Please enter date of acquisition");        
        String acDate = apeScan.nextLine();
        Ape1.setAcquisitionDate(acDate);

        //Prompting input for Monkey acquistion country
        System.out.println("Please enter country where acquired");        
        String acPlace = apeScan.nextLine();
        Ape1.setAcquisitionLocation(acPlace);

        //prompting input for Monkey training status
        System.out.println("Please enter training status");       
        String TrnST = apeScan.nextLine();
        Ape1.setTrainingStatus(TrnST);

        //Prompting input for Monkey service country
        System.out.println("Please enter service country");        
        String serviceCountry = apeScan.nextLine();
        Ape1.setInServiceCountry(serviceCountry);
      	
        //Prompting input for Monkey tail length
        System.out.println("Please enter tail length");
        String tailLen = apeScan.nextLine();
        Ape1.setTailLength(tailLen);

        //Prompting input for Monkey height
        System.out.println("Please enter height");
        String Height = apeScan.nextLine();
        Ape1.setHeight(Height);

        //Prompting input for Monkey body length 
        System.out.println("Please enter body length");
        String bodyLen = apeScan.nextLine();
        Ape1.setBodyLength(bodyLen);

        //Prompting input for Monkey speciesType
        System.out.println("Please enter species type");
        String specType = apeScan.nextLine();
        apeScan.close();
        for (String monkeyType: monkeyTypes) { //Iterating through Monkey Species List
            if (!specType.equalsIgnoreCase(monkeyType)) { //Making sure that the species type is valid
                System.out.println("\n\tInvalid monkey type, Please enter monkey type");
                return;
            }  
        }
        Ape1.setSpecies(specType);
        //Done getting user input on Monkey parameters

        //Adding Monkey to Monkey array List
      	MonkeyList.add(Ape1);
        

    }
	//----------------------------------------------------------------------Finish this code ----------------------

        // You will need to find the animal by animal type and in service country
        
    public static void reserveAnimal(Scanner scnr) {
        String animalVar = scnr.nextLine();
        if (animalVar.equalsIgnoreCase("dog")) { //If input is Dog, looks through 
            for (Dog dogs: dogList) { //dog Array List by iterating through
                if (dogs.getReserved() == false) { //only can reserve dogs with false reservation status
                    System.out.println();
                    System.out.println(dogs.toString() + "\n\n");
                    

                }
            }
        }
        else if (animalVar.equalsIgnoreCase("monkey")) { //Same as stated on comment line 290 but with Monkeys
            for (Monkey apes: MonkeyList) {
                if (apes.getReserved() == false) {
                    System.out.println();
                    System.out.println(apes.toString() + "\n\n");
    
                }
            }
        }
        else {
            System.out.println("Please enter [dog] or [monkey]"); //resets reserve to cycle back through method
        }
    }    

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	    // Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	    // Remember that you only have to fully implement ONE of these lists. 
	    // The other lists can have a print statement saying "This option needs to be implemented".
	    // To score "exemplary" you must correctly implement the "available" list.

    public static void printAnimals(String line) {
        if (line.equals("4")) {
            for (Dog dogs: dogList) {
                System.out.println();
                System.out.print("Name : " + dogs.getName() + ", Date acquired: " + dogs.getAcquisitionLocation() + ", Training status: " + dogs.getTrainingStatus() + ", reserved: " + dogs.getReserved() + "\n\n");
            
            }
        }
        if (line.equals("5")) {
            for (Monkey apes: MonkeyList) {
                System.out.println();
                System.out.print("Name : " + apes.getName() + ", Date acquired: " + apes.getAcquisitionLocation() + ", Training status: " + apes.getTrainingStatus() + ", reserved: " + apes.getReserved() + "\n\n");
                
            }
        }
        if (line.equals("6")){ //Selection 6 gets all unreserved animals
            for (Dog dogs: dogList) {
                if (dogs.getReserved() == (false)) {
                    System.out.println();
                    System.out.print("Name : " + dogs.getName() + ", Breed: " + dogs.getBreed() + ", Date acquired: " + dogs.getAcquisitionLocation() + ", Training status: " + dogs.getTrainingStatus() + ", reserved: " + dogs.getReserved() + "\n\n");
                    
                }
            }
            for (Monkey apes: MonkeyList) {
                if (apes.getReserved() == (false)) {
                    System.out.println();
                    System.out.print("Name : " + apes.getName() + ", Animal type: " + apes.getSpecies() + ", Date acquired: " + apes.getAcquisitionLocation() + ", Training status: " + apes.getTrainingStatus() + ", reserved: " + apes.getReserved() + "\n\n");
                    
                }
            }
        }
    }

}
