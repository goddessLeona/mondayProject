import java.util.ArrayList;

public class Classes {

    private String classeName;
    ArrayList<Teachers>teachers;
    private String subject;
    private String information;
    private int points;

    public Classes(String classeName, ArrayList<Teachers> teachers, String subject, String information, int points) {
        this.classeName = classeName;
        this.teachers = teachers;
        this.subject = subject;
        this.information = information;
        this.points = points;
    }

    public String getClasseName() {
        return classeName;
    }

    public ArrayList<Teachers> getTeachers() {
        return teachers;
    }

    public String getSubject() {
        return subject;
    }

    public String getInformation() {
        return information;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        StringBuilder teacherName = new StringBuilder();
        for(Teachers t: teachers){
            teacherName.append(t.getFirstName()).append(" ").append(t.getLastname()).append(", ");
        }
        return "Classes{" +
                "classname='" + classeName + '\''+
                ", teachers =[ "+ teacherName.toString()+"]"+
                ", subject =' "+ subject+'\''+
                ", information =' "+ information+'\''+
                "points=[" + points +
                '}';
    }

}
