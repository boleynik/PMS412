package Models;

import java.util.ArrayList;
import java.util.List;

public class Patient extends User {
    private String birthDate;
    private String sex;
    private double weightInPounds;
    private double heightInFeet;
    private ArrayList<Record> records;

    private Patient thisPatient;

    private ArrayList<Medication> medications;

    public Patient(int userID, String email, String phoneNumber, String birthDate, String sex, double weightInPounds, double heightInFeet, ArrayList<Record> records, ArrayList<Medication> medications)
    {
        super(userID, email, phoneNumber);
        this.birthDate = birthDate;
        this.sex = sex;
        this.weightInPounds = weightInPounds;
        this.heightInFeet = heightInFeet;
        this.records = records;
        this.medications = medications;
        thisPatient = this;
    }


    /**
     * Retrieves the birth date of the person.
     *
     * @return The birth date of the person as a Date object.
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the birth date of the person.
     *
     * @param birthDate The new birth date to be set for the person.
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        patientMemento();
    }

    /**
     * Retrieves the sex of the person.
     *
     * @return The sex of the person as a String.
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the sex of the person.
     *
     * @param sex The new sex to be set for the person.
     */
    public void setSex(String sex) {
        this.sex = sex;
        patientMemento();
    }

    /**
     * Retrieves the weight of the person in pounds.
     *
     * @return The weight of the person in pounds as a double.
     */
    public double getWeightInPounds() {
        return weightInPounds;
    }

    /**
     * Sets the weight of the person in pounds.
     *
     * @param weightInPounds The new weight to be set for the person in pounds.
     */
    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
        patientMemento();
    }

    /**
     * Retrieves the height of the person in feet.
     *
     * @return The height of the person in feet as a double.
     */
    public double getHeightInFeet() {
        return heightInFeet;
    }

    /**
     * Sets the height of the person in feet.
     *
     * @param heightInFeet The new height to be set for the person in feet.
     */
    public void setHeightInFeet(double heightInFeet) {
        this.heightInFeet = heightInFeet;
        patientMemento();
    }

    /**
     * Retrieves a list of health records associated with the person.
     *
     * @return A List of health records for the person.
     */

    public List<Record> getRecords() {
        return records;
    }

    /**
     * Retrieves a list of medications associated with the patient.
     *
     * @return A List of Medication objects representing the medications prescribed to the patient.
     */
    public List<Medication> getMedications() {
        return medications;
    }

    /**
     * Adds a new health record to the patient's list of records.
     *
     * @param record The health record to be added to the patient's records.
     * @return a boolean representing whether the medication was successfully added
     */

    public Boolean addRecord(Record record) {
        // Implementation details...
        records.add(record);
        patientMemento();
        return true;
    }

    /**
     * Adds a new medication to the patient's list of medications.
     *
     * @param medication The medication to be added to the patient's list of medications.
     * @return a boolean representing whether the medication was successfully added
     */

    public Boolean addMedication(Medication medication) {
        // Implementation details...
        medications.add(medication);
        patientMemento();
        return true;
    }

    /**
     * Method that will export a copy of the patient record to the database anytime it is updated.
     */
    public void patientMemento(){

       // copy of the current patient that will be saved
        Patient patientCopy = thisPatient;

        //SQL Statement to export the copy of the patient will be added here when the use case is implemented

        /*
        All other methods that update any information about the patient call this method to ensure that changes
        are saved
         */

    }

}
