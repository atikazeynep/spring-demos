package com.example.springbootdemo;

public class Course {
    private long id;
    private String courseName, publisher;

    public Course(long id, String courseName, String publisher) {
        this.id = id;
        this.courseName = courseName;
        this.publisher=publisher;
    }

    public long getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
