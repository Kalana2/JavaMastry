package com.service;

import com.enums.EnrollmentStatus;
import com.model.Course;
import com.model.Student;
import com.exception.CourseFullException;

import java.time.LocalDate;

public class Enrollment {

    private final Student student;
    private final Course course;
    private final LocalDate enrollmentDate;
    private EnrollmentStatus status =  EnrollmentStatus.PENDING;


    public Enrollment(Student student, Course course) {
        validateRequest(student, course);

        if (course.isFull()) {
            throw new CourseFullException(
                    "com.model.Course " + course.getCourseCode() + " is full."
            );
        }

        this.student = student;
        this.course = course;
        this.enrollmentDate = LocalDate.now();

        course.enrollStudent();
        this.status =  EnrollmentStatus.ACTIVE;
    }

    public String getDetails() {
        return student.getSummary()
                + " enrolled in "
                + course.getDetails()
                + " on "
                + enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    private void validateRequest(Student student, Course course) {
        if (student == null) {
            throw new IllegalArgumentException("com.model.Student is required");
        }

        if (course == null) {
            throw new IllegalArgumentException("com.model.Course is required");
        }
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    public void cancalEnrollment() {

        if (status == EnrollmentStatus.ACTIVE) {
            throw  new IllegalStateException("Completed enrollment cannot be cancelled");
        }
        if (status == EnrollmentStatus.PENDING) {
            this.status = EnrollmentStatus.CANCELLED;
        }
    }
}