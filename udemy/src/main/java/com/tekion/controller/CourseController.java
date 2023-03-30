package com.tekion.controller;

import com.tekion.dto.Course;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/")
    public List<Course> getCourses(@Va) {
        return Arrays.asList(new Course(1, "General Physics", "I.E. Irodov"),
                new Course(2, "Fundamental of Physics", "HC Verma"),
                new Course(3, "Fundamentals of Physics", "Resnick, Halliday, Walker"));
    }
}
