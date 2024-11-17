package dempmaping.demomaping;

import dempmaping.demomaping.entities.adress;
import dempmaping.demomaping.entities.employe;
import dempmaping.demomaping.service.Userservices;
import org.springframework.aop.TargetSource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoMapingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMapingApplication.class, args);
    }



   @Bean
   CommandLineRunner startDemoMaping(Userservices userservices) {

       return args -> {


           employe emp1= new employe();
           emp1.setEmpname("Ali");
           emp1.setEmpage(new Date());


           employe emp2= new employe();
           emp1.setEmpname("MAB");
           emp1.setEmpage(new Date());


           adress ad1 = new adress();
           ad1.setCity("BONN");

           adress ad2 = new adress();
           ad2.setCity("MIAMI");




           userservices.addnewadress(ad1);
           userservices.addnewadress(ad2);

           // Associate addresses with employees
           emp1.setAdresses(ad2);
           emp2.setAdresses(ad1);

           // Persist employees
           userservices.addnewemploye(emp1);
           userservices.addnewemploye(emp2);






       };
   }


}

