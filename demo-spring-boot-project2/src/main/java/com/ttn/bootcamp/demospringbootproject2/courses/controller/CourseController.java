package com.ttn.bootcamp.demospringbootproject2.courses.controller;

import com.ttn.bootcamp.demospringbootproject2.courses.domain.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Java", "GeeksForGeeks"),new Course(2, "Python", "TutorialsPoint"));
    }

    @GetMapping("/courses/3")
    public Course getCourseDetails() {
        return new Course(3, "JavaScript", "Javatpoint");
    }
}
