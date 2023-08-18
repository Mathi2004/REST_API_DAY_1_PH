package com.example.demo.Controllers;

import java.util.Arrays;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Address;

@RestController
public class ApiController_2 {
           @GetMapping("/address")
           public List<Address> getAddress()
           {
        	   return Arrays.asList(new Address("Sanmathi",122,"noth street",638115,"erode","erode","tamilnadu","india"));
           }
}
