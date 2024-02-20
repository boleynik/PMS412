package Users;

public class Caregiver extends User {
    private String department;

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
}
