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
}
