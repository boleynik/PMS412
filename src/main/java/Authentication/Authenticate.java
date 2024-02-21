package Authentication;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class Authenticate {

    /*
     * EMPLOYEE HASHMAP
     * Key: Employee User ID
     * Value: Hashed User Password
     */
    HashMap<String, String> Employees = new HashMap<>();
    /*
     * PATIENT HASHMAP
     * Key: Patient email
     * Value: Patient password and DOB separated by a space
     */
    HashMap<String, String> Patients = new HashMap<>();

    /*
     * Looks up the employee login information and returns whether authentication was successful or not.
     * @param employee_id the employee's user login
     * @param password the employee's password
     * @return a boolean representing whether authentication passes
     */
    public Boolean authenticateEmployee(String employee_id, String password){
        // Implementation details... 
    }
    
    /*
     * Looks up the patient login information and returns whether authentication was successful or not.
     * @param patient_id the patient's user login
     * @param dob the patient's date of birth
     * @param password the patient's password
     * @return a boolean representing whether authentication passes
     */
    public Boolean authenticatePatient(String patient_id, GregorianCalendar dob, String password){
        // Implementation details... 
    }

    /*
     * Changes an employee password if authentication passes
     * @param employee_id the employee's user login
     * @param old_password the employee's old password
     * @param new_password the employee's new requested password
     * @return a boolean representing whether authentication passes
     */
    public Boolean changeEmployeePassword(String employee_id, String old_password, String new_password){
        // Implementation details... 
    }

    /*
     * Changes the patient's password if authentication passes
     * @param patient_id the patient's user login
     * @param dob the patient's date of birth
     * @param old_password the patient's old password
     * @param new_password the patient's new requested password
     * @return a boolean representing whether authentication passes
     */
    public Boolean changePatientPassword(String patient_id, GregorianCalendar dob, String old_password, String new_password){
        // Implementation details... 
    }

    /*
     * Adds a new employee to the dictionary
     * @param employee_id the employee's user login
     * @param password the employee's password
     * @return a boolean representing whether authentication passes
     */
    public Boolean addNewEmployee(String employee_id, String password){
        // Implementation details... 
    }

    /*
     * Adds a new patient to the dictionary
     * @param patient_id the patient's user login
     * @param dob the patient's date of birth
     * @param password the patient's password
     * @return a boolean representing whether authentication passes
     */
    public Boolean addNewPatient(String patient_id, GregorianCalendar dob, String password){
        // Implementation details... 
    }

    /*
     * Checks if an employee exists in the dictionary
     * @param employee_id the employee's user login
     * @return a boolean representing whether the employee exists or not
     */
    public Boolean employeeExists(String employee_id){
        //Implementation details...
    }

    /*
     * Checks if a patient exists or not
     * @param patient_id the patients user login
     * @return a boolean representing whether the patient exists or not
     */
    public Boolean patientExists(String patient_id){
        //Implementation details...
    }
}
