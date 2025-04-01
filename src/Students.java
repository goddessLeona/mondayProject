import java.util.ArrayList;

public class Students extends Users{

    private ArrayList<Classes>atendingClasses;

    public Students(String username, String firstName, String lastname, String userId, ArrayList<Classes> atendingClasses) {
        super(username, firstName, lastname, userId);
        this.atendingClasses = atendingClasses;
    }

    public ArrayList<Classes> getAtendingClasses() {
        return atendingClasses;
    }

    @Override
    public String toString() {
        return "Students{" +
                "atendingClasses=" + atendingClasses +
                '}';
    }


}
