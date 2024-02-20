package Users;

import java.util.Date;

public class Patient extends User {
    private Date birthDate;
    private String sex;
    private double weightInPounds;
    private double heightInFeet;

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
}
