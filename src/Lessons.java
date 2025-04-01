import java.util.ArrayList;
import java.util.Date;

public class Lessons {

    private Date starteDate;
    private Date endDate;
    private ArrayList<Students>students;
    private int maxStudents;

    public Lessons(Date starteDate, Date endDate, ArrayList<Students> students, int maxStudents) {
        this.starteDate = starteDate;
        this.endDate = endDate;
        this.students = students;
        this.maxStudents = maxStudents;
    }

    public Date getStarteDate() {
        return starteDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "starteDate=" + starteDate +
                ", endDate=" + endDate +
                ", students=" + students +
                ", maxStudents=" + maxStudents +
                '}';
    }
}
