package de.neuefische.model;

import java.util.Objects;

public class Student {
    // Attribute
    private String name;
    private int maNummer;

    // konstruktor
    public Student(String name, int maNummer) {
        this.name = name;
        this.maNummer = maNummer;
    }

    //getter&setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaNummer() {
        return maNummer;
    }


    public void setMaNummer(int maNummer) {
        this.maNummer = maNummer;
    }

    //toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", maNummer=" + maNummer +
                '}';
    }

    //equal&hash


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return maNummer == student.maNummer && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maNummer);
    }
}
