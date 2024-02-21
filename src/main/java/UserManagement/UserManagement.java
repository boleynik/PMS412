package UserManagement;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;

import MedicationManagement.Medication;
import Users.Caregiver;
import Users.Patient;

public class UserManagement{
    
    HashMap<String, Caregiver> Employees = new HashMap<>();
    HashMap<String, Patient> Patients = new HashMap<>();

    /**
     * Adds an employee to the patients dictionary
     * 
     * @param user_id user's login
     * @param employee_info the Caregiver object holding the initial employee information
     * @return a boolean representing whether the employee was successfully added
     */
    public static Boolean addEmployee(String user_id, Caregiver employee_info){
        //Implemnentation details...
    }

    /**
     * Adds a patient to the patients dictionary
     * 
     * @param user_id user's login
     * @param patient_info the Patient object holding the initial patient information
     * @return a boolean representing whether the patient was successfully added
     */
    public static Boolean addPatient(String user_id, Patient patient_info){
        //Implemnentation details...
    }

    /**
     * Gets a patient object corresponding to the patient's user ID
     * 
     * @param user_id the user's user login
     * @return the Patient object representing the patient
     */
    public static Patient getPatient(String user_id){
        //Implemnentation details...
    }

    /**
     * Gets a Caregiver object corresponding to the employee's user ID
     * 
     * @param user_id the user's user login
     * @return the Caregiver object representing the patient
     */
    public static Caregiver getEmployee(String user_id){
        //Implemnentation details...
    }

}