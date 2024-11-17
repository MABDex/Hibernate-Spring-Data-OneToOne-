package dempmaping.demomaping.repositories;

import dempmaping.demomaping.entities.adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface adressrep extends JpaRepository<adress, Long> {


    adress findByAdrid (long adrid);

}
