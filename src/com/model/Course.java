package com.model;

public class Course {
    private final String courseCode;
    private final String courseName;
    private final Instructor instructor;
    private int enrolledStudentCount;
    private final int maxEnrolledStudentCount;

    public   Course(String courseCode, String courseName, int maxEnrolledStudentCount, Instructor instructor) {

        if (instructor == null) throw new IllegalArgumentException("instructor cannot be null");
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
        this.maxEnrolledStudentCount = maxEnrolledStudentCount;

    }
    public Instructor getInstructor() {
        return instructor;
    }

    public String getDetails() {
        return courseCode + " - " + courseName ;
    }

    public void enrollStudent() {
        if  (enrolledStudentCount > maxEnrolledStudentCount) throw  new IllegalArgumentException("com.model.Course is already filled");
        this.enrolledStudentCount++;

    }
    public boolean isFull() {
        return enrolledStudentCount >= maxEnrolledStudentCount;
    }
    public String getCourseCode() {
        return courseCode;
    }






}
