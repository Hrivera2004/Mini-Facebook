package FacebookServer;

import java.util.ArrayList;

public class UsersOnlinesList {
    private ArrayList<UserOnline> u = new ArrayList();
    public UsersOnlinesList() {
    }

    public ArrayList<UserOnline> getU() {
        return u;
    }

    public void setU(ArrayList<UserOnline> u) {
        this.u = u;
    }
}
