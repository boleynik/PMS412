package Authentication;

import Models.Authenticate;

import java.util.GregorianCalendar;

public class AuthenticateTests {
    public void test_add(){
        // must run this test first, tests both adding and the exists function
        String employee_id = "00000001";
        assert Authenticate.employeeExists(employee_id) == false;
        Authenticate.addNewEmployee(employee_id, "password");
        assert Authenticate.employeeExists(employee_id) == true;

        String patient_id = "000000000";
        assert Authenticate.patientExists(patient_id) == false;
        Authenticate.addNewPatient(patient_id, new GregorianCalendar(2002, 12, 01), "password");
        assert Authenticate.patientExists(patient_id) == true;
    }

    public void test_change_pass(){
        // depends on previous test being run first, tests both changing password and authentication functions.
        String employee_id = "00000001";
        String patient_id = "000000000";

        assert Authenticate.authenticateEmployee(employee_id, "password") == true;
        assert Authenticate.authenticatePatient(patient_id, new GregorianCalendar(2002, 12, 01), "password") == true;

        Authenticate.changeEmployeePassword(employee_id, "password", "new_password");
        Authenticate.changePatientPassword(patient_id, new GregorianCalendar(2002, 12, 01), "password", "new_password");

        assert Authenticate.authenticateEmployee(employee_id, "password") == false;
        assert Authenticate.authenticatePatient(patient_id, new GregorianCalendar(2002, 12, 01), "password") == false; 
    }
}
