package school.cesar.projetofinalnext.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.cesar.projetofinalnext.ententies.Aluno;

@Repository
public interface AlunoDao extends JpaRepository <Aluno, Long> {
    Aluno findByCpf(String cpf);

   }
