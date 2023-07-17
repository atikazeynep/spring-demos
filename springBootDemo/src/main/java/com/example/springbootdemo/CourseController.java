package com.example.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn ZORT", "Cart"),
                new Course(2, "Learn ZORT2", "Cart"),
                new Course(3, "Learn ZORT3", "Cart"),
                new Course(4, "Learn ZORT4", "Cart")
        );
    }
}
