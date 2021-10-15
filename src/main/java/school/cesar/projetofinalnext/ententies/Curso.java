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
@Table(name = "CURSO")
@Entity
public class Curso {
    @Column(name = "CURSO", nullable = true)
   private Disciplina disciplina;


}
