package de.neuefische.DB;

import de.neuefische.model.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void listShouldReturnAllStudents(){
        // GIVEN
        Student student1 = new Student("Peter" 1);
        Student student3 = new Student("Maria" 2);

        Student[] students = {student1, student3};
        StudentDB studentDB = new StudentDB(students)

    }

}