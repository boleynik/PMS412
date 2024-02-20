package MedicationManagement;

import java.util.Date;
import Users.Caregiver;

public class Medication {
    private String name;
    private double dosage;
    private String frequency;
    private Date prescriptionDate;
    private Date expirationDate;
    private Caregiver prescribingDoctor;
    private String instructions;
    private boolean isOverTheCounter;
    private boolean isGeneric;
    private String notes;

    /**
     * Retrieves the name of the medication.
     *
     * @return The name of the medication as a String.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the medication.
     *
     * @param name The new name to be set for the medication.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the dosage of the medication.
     *
     * @return The dosage of the medication as a double.
     */
    public double getDosage() {
        return dosage;
    }

    /**
     * Sets the dosage of the medication.
     *
     * @param dosage The new dosage to be set for the medication.
     */
    public void setDosage(double dosage) {
        this.dosage = dosage;
    }

    /**
     * Retrieves the frequency of taking the medication.
     *
     * @return The frequency of the medication as a String.
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the frequency of taking the medication.
     *
     * @param frequency The new frequency to be set for the medication.
     */
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * Retrieves the date when the medication was prescribed.
     *
     * @return The prescription date as a Date object.
     */
    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    /**
     * Sets the date when the medication was prescribed.
     *
     * @param prescriptionDate The new prescription date to be set for the medication.
     */
    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    /**
     * Retrieves the expiration date of the medication.
     *
     * @return The expiration date as a Date object.
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the expiration date of the medication.
     *
     * @param expirationDate The new expiration date to be set for the medication.
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Retrieves the caregiver who prescribed the medication.
     *
     * @return The prescribing caregiver as a Caregiver object.
     */
    public Caregiver getPrescribingDoctor() {
        return prescribingDoctor;
    }

    /**
     * Sets the caregiver who prescribed the medication.
     *
     * @param prescribingDoctor The new prescribing caregiver to be set for the medication.
     */
    public void setPrescribingDoctor(Caregiver prescribingDoctor) {
        this.prescribingDoctor = prescribingDoctor;
    }

    /**
     * Retrieves any specific instructions for taking the medication.
     *
     * @return The instructions for taking the medication as a String.
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * Sets specific instructions for taking the medication.
     *
     * @param instructions The new instructions to be set for the medication.
     */
    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    /**
     * Checks if the medication is available over the counter.
     *
     * @return true if the medication is available over the counter, false otherwise.
     */
    public boolean isOverTheCounter() {
        return isOverTheCounter;
    }

    /**
     * Sets whether the medication is available over the counter.
     *
     * @param overTheCounter true if the medication is available over the counter, false otherwise.
     */
    public void setOverTheCounter(boolean overTheCounter) {
        isOverTheCounter = overTheCounter;
    }

    /**
     * Checks if the medication is a generic version.
     *
     * @return true if the medication is a generic version, false otherwise.
     */
    public boolean isGeneric() {
        return isGeneric;
    }

    /**
     * Sets whether the medication is a generic version.
     *
     * @param generic true if the medication is a generic version, false otherwise.
     */
    public void setGeneric(boolean generic) {
        isGeneric = generic;
    }

    /**
     * Retrieves any additional notes or comments about the medication.
     *
     * @return Additional notes about the medication as a String.
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets additional notes or comments about the medication.
     *
     * @param notes The new notes to be set for the medication.
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}
