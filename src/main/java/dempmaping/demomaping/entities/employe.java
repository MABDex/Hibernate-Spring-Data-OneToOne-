package dempmaping.demomaping.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class employe {


    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long empid;
    private String empname;
    private Date empage;

    @OneToOne
    private adress adresses;

}
