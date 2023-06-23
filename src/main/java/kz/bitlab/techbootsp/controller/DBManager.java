package kz.bitlab.techbootsp.controller;

import kz.bitlab.techbootsp.db.Student;

import java.util.ArrayList;

public class DBManager {
  private static final ArrayList<Student> students = new ArrayList<>();
  private static Long id = 6L;
  static {
    students.add(new Student(1L, "Assem", "Kassenova", 90, "A" ));
    students.add(new Student(2L, "Dilnaz", "Yussupova", 85, "B" ));
    students.add(new Student(3L, "Maksat", "Baykadamov", 95, "A" ));
    students.add(new Student(4L, "Aruzhan", "Ruskylbekova", 80, "B" ));
    students.add(new Student(5L, "Sayat", "Zhakssybay", 70, "C" ));
  }
  public static ArrayList<Student> getStudents(){
    return students;
  }
  public static void addStudent(Student student){
    student.setId(id);
    id++;
    students.add(student);
  }
}
