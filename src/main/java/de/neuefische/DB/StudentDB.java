package de.neuefische.DB;

import de.neuefische.model.Student;

import java.util.Arrays;

public class StudentDB {

    private Student[] studentArray;


    // Konstruktor
    public StudentDB(Student[] studentArray) {

        this.studentArray = studentArray;
    }

    // Methoden
    public Student[] list(){
        return this.studentArray;
    }

    ////////
    public Student[] add(String name, int maNummer){
        Student[] studentArrayExtended= new Student[this.studentArray.length+1];

        // this.studentArray.length-> Anzahl der alten Studenten
        studentArrayExtended[this.studentArray.length] = new Student(name, maNummer);

        // Inhalt des alten in das neue kopieren
        System.arraycopy(this.studentArray, 0,
                studentArrayExtended, 0,
                this.studentArray.length);

        studentArray=studentArrayExtended;
        return studentArray;
    }

    /////////

    public Student randomStudent(){
        int range = (this.studentArray.length);
        int random = (int) (Math.random() * range);

        return this.studentArray[random];

      }

    // toString
    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + Arrays.toString(studentArray) +
                '}';
    }
}

