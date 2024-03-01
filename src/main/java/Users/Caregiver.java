package Users;

import MedicationManagement.*;
import InformationManagement.Record;

public class Caregiver extends User {
    private String department;

    public Caregiver(int userID, String email, double phoneNumber, String department) {
        super(userID, email, phoneNumber);
        this.department = department;
    }

    /**
     * Retrieves the department to which the user belongs.
     *
     * @return The department as a String.
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the department for the user.
     *
     * @param department The new department to be set for the user.
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Assigns a patient to the caregiver, updating the caregiver's client list.
     *
     * @param patient The patient to be assigned to the caregiver.
     * @throws IllegalArgumentException If the patient is already assigned to the caregiver or if the patient is null.
     */
    public void assignPatient(Patient patient) {
        // Implementation details...
    }

    /**
     * Unassigns a patient from the caregiver, removing the patient from the caregiver's client list.
     *
     * @param patient The patient to be unassigned from the caregiver.
     * @throws IllegalArgumentException If the patient is not currently assigned to the caregiver or if the patient is null.
     */
    public void unassignPatient(Patient patient) {
        // Implementation details...
    }

    /**
     * Adds a new health record for the specified patient to the patient's list of records.
     *
     * @param record The health record to be added to the patient's records.
     * @param patient The Patient object for whom the health record is being added.
     * @throws IllegalArgumentException If the specified record is already present in the patient's records, if the record is null, or if the patient is null.
     */
    public void addRecord(Record record, Patient patient) {
        // Implementation details...
    }

    /**
     * Removes a specific health record from the specified patient's list of records.
     *
     * @param record The health record to be removed from the patient's records.
     * @param patient The Patient object from whom the health record is being removed.
     * @throws IllegalArgumentException If the specified record is not present in the patient's records, if the record is null, or if the patient is null.
     */
    public void removeRecord(Record record, Patient patient) {
        // Implementation details...
    }


    /**
     * Retrieves the most recent health record for the patient.
     *
     * @return The latest health record of the patient.
     */

    /**
     * Assigns a new medication to the specified patient, adding it to the list of prescribed medications.
     *
     * @param medication The Medication object representing the medication to be assigned.
     * @param patient The Patient object to whom the medication is being assigned.
     * @throws IllegalArgumentException If the specified medication is already assigned to the patient, if the medication is null, or if the patient is null.
     */
    public void assignMedication(Medication medication, Patient patient) {
        // Implementation details...
    }

    /**
     * Removes a specific medication from the specified patient's list of prescribed medications.
     *
     * @param medication The Medication object representing the medication to be removed.
     * @param patient The Patient object from whom the medication is being removed.
     * @throws IllegalArgumentException If the specified medication is not present in the patient's list of prescribed medications, if the medication is null, or if the patient is null.
     */
    public void removeMedication(Medication medication, Patient patient) {
        // Implementation details...
    }
}
