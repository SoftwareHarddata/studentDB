import de.neuefische.DB.StudentDB;
import de.neuefische.model.Student;

public class AppMain {
    public static void main(String[] args) {
        Student student = new Student("Magnus", 54544);
        Student student2 = new Student("Yan", 12121);



        Student[] studentArray = {student, student2};

        StudentDB studentDB = new StudentDB(studentArray);
        // studentDB.add("Felix", 5555);

        System.out.println(studentDB);
    }


}
