package Users;

import InformationManagement.Record;

import java.util.Date;
import java.util.List;

public class Patient extends User {
    private Date birthDate;
    private String sex;
    private double weightInPounds;
    private double heightInFeet;



    private List<Record> records;

    /**
     * Retrieves the birth date of the person.
     *
     * @return The birth date of the person as a Date object.
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the birth date of the person.
     *
     * @param birthDate The new birth date to be set for the person.
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
    }

    /**
     * Retrieves a list of health records associated with the person.
     *
     * @return A List of health records for the person.
     */
    public List<Record> getRecords() {
        return records;
    }

}
