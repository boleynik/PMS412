package InformationManagement;

import java.util.Date;

public class Record {
    private String healthcareProvider;
    private Date dateOfService;
    private String typeOfService;
    private String notes;

    // Constructor
    public Record(String healthcareProvider, Date dateOfService, String typeOfService, String notes) {
        this.healthcareProvider = healthcareProvider;
        this.dateOfService = dateOfService;
        this.typeOfService = typeOfService;
        this.notes = notes;
    }

    public Record(String healthcareProvider, Date dateOfService, String typeOfService){
        this.healthcareProvider = healthcareProvider;
        this.dateOfService = dateOfService;
        this.typeOfService = typeOfService;
        this.notes = "";
    }

    // Getters and Setters

    public String getHealthcareProvider() {
        return healthcareProvider;
    }

    public void setHealthcareProvider(String healthcareProvider) {
        this.healthcareProvider = healthcareProvider;
    }

    public Date getDateOfService() {
        return dateOfService;
    }

    public void setDateOfService(Date dateOfService) {
        this.dateOfService = dateOfService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    // toString method to display the record
    @Override
    public String toString() {
        return "Record{" +
                "healthcareProvider='" + healthcareProvider + '\'' +
                ", dateOfService=" + dateOfService +
                ", typeOfService='" + typeOfService + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
