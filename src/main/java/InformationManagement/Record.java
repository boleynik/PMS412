package InformationManagement;

import java.util.Date;

public class Record {
    String title;
    String description;
    String notes;
    Date dateAdded;




    public Record(){
        title = "noTitle";
        description = "noDesc";
        notes = "noNote";
        dateAdded = new Date();
    }
}
