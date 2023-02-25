public class CovidVaccine {
    private String SID, firstName, lastName;
    private String[] listOfVaccines;

    CovidVaccine(String SID, String firstName, String lastName, String[] listOfVaccines) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.listOfVaccines = listOfVaccines;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String[] getListOfVaccines() {
        return listOfVaccines;
    }

    public String getSID() {
        return SID;
    }

    @Override
    public String toString() {
        return "SID: " + this.SID + ", First Name: " + this.firstName + ", Last Name: " + this.lastName + ", List of Vaccines: " + String.join(",", listOfVaccines);
    }
}
