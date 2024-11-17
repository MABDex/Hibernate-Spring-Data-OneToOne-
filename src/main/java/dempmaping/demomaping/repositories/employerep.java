package dempmaping.demomaping.repositories;

import dempmaping.demomaping.entities.employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employerep extends JpaRepository<employe, Long> {

    employe findByEmpname (String empname);



}
