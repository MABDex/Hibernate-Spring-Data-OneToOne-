package dempmaping.demomaping.service;

import dempmaping.demomaping.entities.adress;
import dempmaping.demomaping.entities.employe;
import dempmaping.demomaping.repositories.adressrep;
import dempmaping.demomaping.repositories.employerep;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@Transactional


@AllArgsConstructor
public class userservicesimpl implements Userservices {


    private adressrep adrp;
    private employerep emprp;


    @Override
    public adress addnewadress(adress adress) {
        return adrp.save(adress);
    }

    @Override
    public employe addnewemploye(employe employe) {
        return emprp.save(employe);
    }

    @Override
    public adress findByAdrid(long adrid) {
        return adrp.findByAdrid(adrid);
    }

    @Override
    public employe findByEmpname(String empname) {
        return emprp.findByEmpname(empname);
    }




}
