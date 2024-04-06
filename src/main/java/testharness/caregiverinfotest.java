package testharness;

import Controllers.CaregiverInfoController;
import Models.Caregiver;
import Models.Medication;
import Models.Patient;
import Models.Record;
import Views.CaregiverInfoView;

import java.util.ArrayList;

public class caregiverinfotest {
    public static void main(String[] args) {

        ArrayList<Record> patient1records = new ArrayList<>();
        ArrayList<Medication> patient1meds = new ArrayList<>();

        ArrayList<Patient> caregiver1Patients = new ArrayList<>();

        Caregiver caregiver1 = new Caregiver(101, "janedoe@gmail.com", "9122122212", "General Medicine", caregiver1Patients);
        
        Patient patient1 = new Patient(001, "johnsmith@gmail.com", "8144444444", "2000-01-01", "M", 160, 6, patient1records, patient1meds);

        CaregiverInfoView view = new CaregiverInfoView();
        CaregiverInfoController controller = new CaregiverInfoController(caregiver1, view);
        view.setVisible(true);

    }
}
