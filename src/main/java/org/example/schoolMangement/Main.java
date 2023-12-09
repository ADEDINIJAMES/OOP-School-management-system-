package org.example.schoolMangement;

import org.example.schoolMangement.Entity.*;
import org.example.schoolMangement.enums.*;
import org.example.schoolMangement.serviceImpl.PrincipalServiceImpl;
import org.example.schoolMangement.serviceImpl.StudentServiceImpl;
import org.example.schoolMangement.serviceImpl.TeacherServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.example.schoolMangement.enums.Job.PRINCIPAL;
import static org.example.schoolMangement.enums.Job.TEACHER;

public class Main {
    public static void main(String[] args) {
        PrincipalServiceImpl principalService = new PrincipalServiceImpl();
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        StudentServiceImpl studentService= new StudentServiceImpl();
        Levels levels = new Levels();
        Courses courses = new Courses();
        List<Students> student = new ArrayList<>();
        Students students = new Students();
        students.setGrade(40);
        students.setName("Fadinx");
        levels.setLevelName(LevelName.SSS_1);
        levels.setDepartment(Department.SCIENCE);
        levels.setClassTeacherName("Mr. Olanipekun");



        Applicants applicants = new Applicants();

        applicants.setName("Abiola");
        applicants.setAge(15);
        Staff staff= new Staff();
        staff.setJob(PRINCIPAL);
        staff.setName("Peter");
        courses.setCourse_teacher("Mr. Olanipekun");
        courses.setCourse_title(Course_title.BIOLOGY);
        courses.setDepartment(Department.SCIENCE);
        courses.setEnrolledStudents(25);






        principalService.admit(applicants, staff);
//        principalService.hire(staff);
//principalService.expel(staff, students);
//principalService.check_performance(staff);

//        teacherService.record_performance(staff, students);
//        teacherService.teach(staff,courses);
//        studentService.take_course(students, courses);
       // studentService.register(staff, students, levels);


    }


}