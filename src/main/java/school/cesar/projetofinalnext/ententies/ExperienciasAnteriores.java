package school.cesar.projetofinalnext.ententies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EXPERIENCIAS")
@Entity
public class ExperienciasAnteriores {
    @Column(name = "EXPERIENCIAS", nullable = true)
    private String experiencias;

}
