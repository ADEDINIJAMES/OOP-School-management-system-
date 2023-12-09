package org.example.schoolMangement.Entity;

import org.example.schoolMangement.enums.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Students extends User {

    public static List<Students> listOfstudent = new ArrayList<>();
    private int admissionId;
    private String guardianName;
    private  Long guardianPhone;
    private LevelName level;
    private Department department;
    private int  noOfCourses;
    private Terms semester;
    private int grade;
    private Category category;
    private BigDecimal payment;
    private LocalDate dateOfAdmission;
    private List<Courses> courses;


    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public long getGuardianPhone() {
        return guardianPhone;
    }

    public void setGuardianPhone(long guardianPhone) {
        this.guardianPhone = guardianPhone;
    }

    public LevelName getLevel() {
        return level;
    }

    public void setLevel(LevelName level) {
        this.level = level;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getNoOfCourses() {
        return noOfCourses;
    }

    public void setNoOfCourses(int noOfCourses) {
        this.noOfCourses = noOfCourses;
    }
    public Terms getSemester() {
        return semester;
    }

    public List<Courses> getCourses() {
        return courses;
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public int getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(int admissionId) {
        this.admissionId = admissionId;
    }
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }


    public Students() {

    }

    public Students(String name, Gender gender, int age) {
        super(name, gender, age);
    }

    public void setSemester(Terms semester) {
        this.semester = semester;
    }

    public Students(String name, Long phoneNumber, String address, String email, Gender gender, LocalDate dateOfbirth, int age, String stateOfOrigin, String localGovernmentOforigin, String nextOfKin, long nextOfkinphone, BloodGroup bloodGroup, Genotype genotype, String underlyingAilment, String guardianName, Long guardianPhone, LevelName level, Department department, int noOfCourses, Terms semester, int grade, Category category, BigDecimal payment, LocalDate dateOfAdmission, List<Courses> courses, int admissionId) {

        super(name, phoneNumber, address, email, gender, dateOfbirth, age, stateOfOrigin, localGovernmentOforigin, nextOfKin, nextOfkinphone, bloodGroup, genotype, underlyingAilment);
        this.guardianName = guardianName;
        this.guardianPhone = guardianPhone;
        this.level = level;
        this.department = department;
        this.noOfCourses = noOfCourses;
        this.courses = courses;
        this.semester = semester;
        this.grade = grade;
        this.category = category;
        this.payment = payment;
        this.dateOfAdmission = dateOfAdmission;
        this.admissionId= admissionId;
    }
    @Override
    public String toString() {
        return "Students{" +
                "guardian_name='" + guardianName + '\'' +
                ", guardian_phone=" + guardianPhone +
                ", level='" + level + '\'' +
                ", department=" + department +
                ", noOfCourses=" + noOfCourses +
                ", courses=" + courses +
                ", semester='" + semester + '\'' +
                ", grade='" + grade + '\'' +
                ", category=" + category +
                ", payment=" + payment +
                ", dateOfAdmission=" + dateOfAdmission +
                "admissionid'" + admissionId+
                '}';





    }
}
