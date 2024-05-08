package org.example.Controller;

import org.example.Enitity.Employee;
import org.example.Service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
@CrossOrigin
public class Employeecontroller {

    @Autowired
    Employeeservice employeeservice;

    @PostMapping("/createemp")
    private String create(@RequestBody  Employee employee){
        String s = employeeservice.createemployee(employee);
        return s;


    }

    @GetMapping ("/getall")
        private List<Employee> getalldata() {
            return employeeservice.getall();

        }

    private static final String UPLOAD_DIR = "D:\\uploads\\";

    @PostMapping("/upload")
    public String uploadFile(@RequestParam("File") MultipartFile file) {
        if (file.isEmpty()) {
            return "Please select a file to upload";
        }
        try {
            // Get the file and save it
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOAD_DIR + file.getOriginalFilename());
            Files.write(path, bytes);
            return "File uploaded successfully: " + file.getOriginalFilename();
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to upload file: " + e.getMessage();
        }
    }
    }

