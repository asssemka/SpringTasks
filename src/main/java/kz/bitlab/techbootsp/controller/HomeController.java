package kz.bitlab.techbootsp.controller;

import kz.bitlab.techbootsp.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
  @GetMapping(value = "/")
  public String indexPage(){
    return "index";
  }

  @GetMapping(value = "/students")
  public String students(Model model){
    ArrayList<Student> studentArrayList = DBManager.getStudents();
    model.addAttribute("students" , studentArrayList);

    return "students";
  }

  @PostMapping(value = "/add_student")
  public String addStudent(Student student){
    DBManager.addStudent(student);
    return "redirect:/students";
  }

}
