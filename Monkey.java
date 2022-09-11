package Java_Programs.Grazioso_Salvare;

public class Monkey extends RescueAnimal {

    /* 

    Monkey Class derived from RescueAnimal.java
    Defines Monkey for Grazioso_Salvare
    
    */
    private String tailLength;
    private String height;
    private String bodyLength;
    private String speciesType;

    
    // default constructor (that's why it's not overloaded) that inherits from RescueAnimal.java --------------------------------------------------------------
    // (that's why you have the super keyword with all the initialized variables after it)


    public Monkey () {
        super("", "", "", "", "", "", "", false, "");  // Make sure the super default constructor matches the amount of the variables in the super overloaded constructor
    
        tailLength = "";
        height = "";
        bodyLength = "";
        speciesType = "";

    
    
    }
    //Over loaded Ccnstructor to set Monkey Parameters, Inherit from Rescue Animal (that's why you don't see the Monkey parameters after the super keyword).---------

    public Monkey (String name, String animalType, String gender, String age, String weight,
        String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved,
        String inServiceCountry, String tailLength, String height, String bodyLength, String speciesType) {
    	super(name, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus,
              reserved, inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
      	setSpecies(speciesType);
        
      
    }
    // Method that makes Dog object printable when it needs to be printed. Call this method toString() -------------------------------------------------------
    public String toString() {
        String result = ("Name: " + getName() + ", Service location: " + getInServiceLocation());
        return result;
    }

    //Mutators

    //Method that returns Tail length of Monkey
    public String getTailLength() {
        return tailLength;
    }

    //Method that returns Height of Monkey
    public String getHeight() {
        return height;
    }

    //Method that returns Body length of Monkey
    public String getBodyLength() {
        return bodyLength;
    }

    //Method that returns Species type of Monkey
    public String getSpecies() {
        return speciesType;
    }

    // Accessors

    //Method to set tail length of Monkey
    //@Tail length
    public void setTailLength(String newLength) {
        tailLength = newLength;

    }
    //Method to set Height of Monkey
    //@Height
    public void setHeight(String newHeight){
        height = newHeight;

    }
    //Method to set body length of Monkey
    //@Body length
    public void setBodyLength(String newLength) {
        bodyLength = newLength;

    }
    //Method to set species type of Monkey
    //@Species type
    public void setSpecies(String Typeinit) {
        speciesType = Typeinit;

    }
    
    
}
