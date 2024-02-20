package InformationManagement;

import Users.User;
import Users.Patient;
import Users.Caregiver;

public class InformationView {
    User authProfile;
    User openProfile;


    public InformationView(User authProfile, User openProfile){
        this.authProfile = authProfile;
        this.openProfile = openProfile;
    }

    public User getAuthProfile(){
        return authProfile;
    }

    public User getOpenProfile(){
        return openProfile;
    }

    public void setOpenProfile(User toProfile){
        this.openProfile = toProfile;
    }

}
