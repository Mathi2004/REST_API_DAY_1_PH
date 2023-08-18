package com.example.demo.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Student;

@RestController
public class ApiController_1 {
@GetMapping("/student")
public List<Student> getWelcomeMessage()
{
	return Arrays.asList(new Student("Sanmathi","Welcome!"));
}
}
