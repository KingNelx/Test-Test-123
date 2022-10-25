package crudbe.Controller;


import crudbe.Entity.Admin;
import crudbe.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping
public class AdminController {

    @Autowired
    AdminRepository adminRepository;

    @PostMapping("createAdmin")
    Admin createAdmin(@RequestBody Admin createAdmin){
        return adminRepository.save(createAdmin);
    }

    @GetMapping("/getAdmins")
    List<Admin> getAdmins(){
       return adminRepository.findAll();
    }
}

