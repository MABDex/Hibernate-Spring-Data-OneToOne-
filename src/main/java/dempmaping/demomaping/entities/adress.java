package dempmaping.demomaping.entities;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor

public class adress {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long adrid;


    private String city;

    private String state;

    @OneToOne (mappedBy = "adresses")
    private employe emps;







}
