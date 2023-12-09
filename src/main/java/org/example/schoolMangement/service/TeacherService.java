package org.example.schoolMangement.service;

import org.example.schoolMangement.Entity.Staff;
import org.example.schoolMangement.Entity.Students;
import org.example.schoolMangement.Entity.Courses;

public interface TeacherService {
    void record_performance (Staff staff, Students student );
    void  teach(Staff staff, Courses courses);


}
