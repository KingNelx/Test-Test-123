package crudbe.Controller;


import crudbe.Entity.Admin;
import crudbe.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin("http://localhost:3000/")
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    @PostMapping("/createAdmin")
    Admin createAdmin(@RequestBody Admin createAdmin){
        return adminRepository.save(createAdmin);
    }

    @GetMapping("/getAdmins")
    List<Admin> getAdmins(){
       return adminRepository.findAll();
    }
}

