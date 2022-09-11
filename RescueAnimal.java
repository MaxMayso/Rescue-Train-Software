package Java_Programs.Grazioso_Salvare;


import java.lang.String; 

// Class that defines Rescue Animal for Grazioso Salvare


public class RescueAnimal {

    // Instance variables ----------------------------------------------------------------------------------
    private String name;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionCountry;
	private String trainingStatus;
    private boolean reserved;
	private String inServiceCountry;

	//No default constructor ----------------------------------------------------------------------------------

	
    // Overloaded Constructor for rescue animal parameters -----------------------------------------------------

    public RescueAnimal(String name, String gender, String age, String weight, 
    String acquisitionDate, String acquisitionCountry, String trainingStatus, boolean reserved, 
    String inServiceCountry) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);	
    }


	//------------------
	//Method that returns name of the Rescue animal
	public String getName() {
		return name;
	}
	//Method that sets name of the Rescue animal 
	//@Name
	public void setName(String name) {
		this.name = name;
	}

	//-------------------
	//Method that returns gender type of the Rescue animal
	public String getGender() {
		return gender;
	}
	//Method that sets gender of the Rescue animal
	//@Gender
	public void setGender(String gender) {
		this.gender = gender;
	}


	//-------------------
	//Method that returns Age of the Rescue animal
	public String getAge() {
		return age;
	}
	//Method that sets Age of the Rescue animal
	//@Age
	public void setAge(String age) {
		this.age = age;
	}


	//-------------------
	//Method that returns Weight of the Rescue Animal
	public String getWeight() {
		return weight;
	}
	//Method that sets the Weight of the Rescue Animal
	//@Weight
	public void setWeight(String weight) {
		this.weight = weight;
	}


	//--------------------
	//Method that returns Date of acquisition of the Rescue Animal
	public String getAcquisitionDate() {
		return acquisitionDate;
	}
	//Method that sets the Date of acquisition of the Rescue Animal
	//@Date of acquisition
	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}


	//----------------------
	//Method that returns acquisition location of the Rescue Animal
	public String getAcquisitionLocation() {
		return acquisitionCountry;
	}
	//Method that sets the acquisition location of the Rescue Animal
	//@Acquisition location
	public void setAcquisitionLocation(String acquisitionCountry) {
		this.acquisitionCountry = acquisitionCountry;
	}


	//-------------------------
	//Method that returns reservation status of the Rescue Animal
	public boolean getReserved() {
		return reserved;
	}
	//Method that sets the reservation status of the Rescue Animal
	//@True or False
	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}


	//--------------------------
	//Method that returns location of service of the Rescue Animal
	public String getInServiceLocation() {
		return inServiceCountry;
	}
	//Method that sets the location of service of the Rescue Animal
	//@Service Country
	public void setInServiceCountry(String inServiceCountry) {
		this.inServiceCountry = inServiceCountry;
	}



	//------------------------------
	//Method that returns training status of the Rescue Animal
	public String getTrainingStatus() {
		return trainingStatus;
	}
	//Method that sets the training status of the Rescue Animal
	//@Training Status
	public void setTrainingStatus(String trainingStatus) {
		this.trainingStatus = trainingStatus;
	}
}
