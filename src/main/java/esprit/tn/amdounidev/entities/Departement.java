package esprit.tn.amdounidev.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder // bech nasna3 ay type de constructeur
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepartement")
    private Long idDepartement;
    @Column(name="nomDepartement")
    private String nomDepartement;
}
