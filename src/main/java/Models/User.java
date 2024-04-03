package Models;

import UserManagement.UserManagement;

public class User extends UserManagement {
    private int userID;
    private String email;
    private String phoneNumber;

    public User(int userID, String email, String phoneNumber) {
        this.userID = userID;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieves the user ID associated with this user.
     *
     * @return The user ID as an integer.
     */
    public int getUserID() {
        return userID;
    }

    /**
     * Sets the user ID for this user.
     *
     * @param userID The new user ID to be set.
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * Retrieves the email address of this user.
     *
     * @return The email address as a String.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address for this user.
     *
     * @param email The new email address to be set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retrieves the phone number of this user.
     *
     * @return The phone number as a double.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the phone number for this user.
     *
     * @param phoneNumber The new phone number to be set.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
