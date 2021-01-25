import model.Student;

import java.util.Arrays;

public class StudentDB {

    private Student[] studentArray;

    // konstruktor
    public StudentDB(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    public Student[] list(){
        return this.studentArray;
    }

    public void add(String name, int maNummer){
        Student student = new Student(name, maNummer);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + Arrays.toString(studentArray) +
                '}';
    }
}
