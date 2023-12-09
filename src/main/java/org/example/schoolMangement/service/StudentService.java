package org.example.schoolMangement.service;

import org.example.schoolMangement.Entity.Courses;
import org.example.schoolMangement.Entity.Levels;
import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;

import java.util.logging.Level;

public interface StudentService {
    void take_course(Students students, Courses courses);


    void register(Staff  staff, Students students, Levels level);
}
