package testharness;

import MedicationManagement.Medication;
import Users.Caregiver;
import Users.Patient;
import Users.User;
import InformationManagement.Record;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ArrayList<Record> patient1records = new ArrayList<>();
        ArrayList<Medication> patient1meds = new ArrayList<>();

        ArrayList<Patient> caregiver1Patients = new ArrayList<>();
        Patient patient1 = new Patient(001, "johnsmith@gmail.com", "8144444444", "2000-01-01", "M", 160, 6, patient1records, patient1meds);

        Caregiver caregiver1 = new Caregiver(101, "janedoe@gmail.com", "9122122212", "General Medicine", caregiver1Patients);
        //authenticate

        caregiver1.assignPatient(patient1);
        System.out.println("Caregiver 1's patient list: " + caregiver1Patients);

        caregiver1.unassignPatient(patient1);
        System.out.println("Caregiver 1's patient list: " + caregiver1Patients);

        caregiver1.assignPatient(patient1);

        Record record1 = new Record("Geisinger", "2024-02-28", "General Checkup",
                "Vitals normal, health is overall good, except for a small cold. Prescribing Mucinex for runny nose.");

        caregiver1.addRecord(record1, patient1);
        System.out.println(patient1.getRecords());

        caregiver1


    }
}
