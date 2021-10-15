package school.cesar.projetofinalnext.ententies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EXPERIENCIAS")
@Entity
public class ExperienciasAnteriores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "EXPERIENCIAS", nullable = true)
    private String experiencias;

}
