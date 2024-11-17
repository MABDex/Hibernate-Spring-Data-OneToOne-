package dempmaping.demomaping.service;

import dempmaping.demomaping.entities.adress;
import dempmaping.demomaping.entities.employe;

public interface Userservices {

   adress addnewadress(adress adress);
   employe addnewemploye(employe employe);

   adress findByAdrid (long adrid);
   employe findByEmpname (String empname);




}
