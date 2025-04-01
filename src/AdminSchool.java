import java.util.ArrayList;

public class AdminSchool {

    private ArrayList<Teachers>teachersList;
    private ArrayList<Classes> classesList;

    public AdminSchool(){
        teachersList = new ArrayList<>();
        classesList = new ArrayList<>();
    }

    //add Classes + Teachers

    public void addClass(){

        // create classes
        Classes classMath = new Classes("Matematic01",new ArrayList<>(),"Math", "In this " +
                "class we learn the basic matematical formulars",20);

        Classes classEnglish = new Classes("English02",new ArrayList<>(),"English", "In this " +
                "class we learn english for beginners",20);


        //create teachers
        Teachers teacher1 = new Teachers("TeacherBest","Bengt","Svenson","B001",
                new ArrayList<>());

        Teachers teacher2 = new Teachers("TeacherStina","Stina","Svenson","S001",
                new ArrayList<>());

        // add the class to the teacher teachingClass list
        teacher1.getTeachingClasses().add(classMath);
        teacher2.getTeachingClasses().add(classEnglish);

        //add the teacher to the list of teachers
        teachersList.add(teacher1);
        teachersList.add(teacher2);

        //add the class to the classes list
        classesList.add(classMath);
        classesList.add(classEnglish);

        // add teachers to the class`s teachers list
        classMath.getTeachers().add(teacher1);
        classEnglish.getTeachers().add(teacher2);

        System.out.println("test");
        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(classEnglish);
    }


    public void runSystem(){



    }

}
