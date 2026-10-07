package com.model;

public class Student extends User {

    private final String degree;
    private static int studentCount = 0;

    public Student(
            String id,
            String name,
            String degree
    ) {
        super(id, name);

        if (degree == null || degree.isBlank()) {
            throw new IllegalArgumentException(
                    "Degree cannot be empty"
            );
        }

        this.degree = degree;
        studentCount++;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String getRole() {
        return "com.model.Student";
    }

    public String getStudentSummary() {
        return super.getSummary() + " - " + degree;
    }
}