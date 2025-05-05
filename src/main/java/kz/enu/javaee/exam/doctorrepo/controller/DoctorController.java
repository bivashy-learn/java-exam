package kz.enu.javaee.exam.doctorrepo.controller;

import kz.enu.javaee.exam.doctorrepo.entity.Doctor;
import kz.enu.javaee.exam.doctorrepo.repository.DoctorRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DoctorController {

    private final DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("/doctors")
    public List<Doctor> doctors() {
        return doctorRepository.findAll();
    }

    @PostMapping("/createDoctor")
    public Doctor createDoctor(@RequestBody DoctorModel doctorModel) {
        return doctorRepository.save(doctorModel.asDoctor());
    }

    @DeleteMapping("/doctor/{id}")
    public void deleteById(@PathVariable("id") long id) {
        doctorRepository.deleteById(id);
    }

}
