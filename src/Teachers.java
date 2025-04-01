import java.util.ArrayList;

public class Teachers extends Users{

    private ArrayList<Classes>teachingClasses;

    public Teachers(String username, String firstName, String lastname, String userId, ArrayList<Classes> teachingClasses) {
        super(username, firstName, lastname, userId);
        this.teachingClasses = teachingClasses;
    }

    public ArrayList<Classes> getTeachingClasses() {
        return teachingClasses;
    }

    @Override
    public String toString() {
        StringBuilder className = new StringBuilder();
        for(Classes c: teachingClasses){
            className.append(c.getClasseName()).append(", ");
        }
        return "Teachers{" +
                "username='" + getUsername() + '\''+
                ", firstName =' "+ getFirstName()+'\''+
                ", lastName =' "+ getLastname()+'\''+
                ", userId =' "+ getUserId()+'\''+
                "teachingClasses=[" + className.toString() + "]"+
                '}';
    }
}
