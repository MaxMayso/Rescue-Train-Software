package Java_Programs.Grazioso_Salvare;


//Dog class that is derived from Rescue Animal class
public class Dog extends RescueAnimal {

       // Instance variables
       private String breed;
  	
    
       public Dog () {
           super("Starbucks", " ", " ", "", "", "", "", false, "");
         
           breed = " ";
           
       }


    // Constructor that inherits from Rescue Animal
    public Dog(String name, String breed, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry,
	    String trainingStatus, boolean reserved, String inServiceCountry) {
        super(name, gender, age, weight, acquisitionDate,  acquisitionCountry,  trainingStatus,  reserved, inServiceCountry);
        setBreed(breed);
    }

    public String toString() {
        String result = ("Name: " + getName() + ", Service location: " + getInServiceLocation());
        return result;
    }



    // Accessor Method
    //Method that returns breed type for dog when called
    public String getBreed() {
        return breed;
    }

    // Mutator Method
    //Method that sets breed type for dog when called
    //@Breed
    public void setBreed(String dogBreed) {
        breed = dogBreed;
    }

}
