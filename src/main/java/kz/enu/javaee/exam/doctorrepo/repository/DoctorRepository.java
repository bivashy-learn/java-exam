package kz.enu.javaee.exam.doctorrepo.repository;

import kz.enu.javaee.exam.doctorrepo.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
