package school.cesar.projetofinalnext.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.cesar.projetofinalnext.dao.AlunoDao;
import school.cesar.projetofinalnext.ententies.Aluno;
import school.cesar.projetofinalnext.exception.AlunoInvalidoException;
import school.cesar.projetofinalnext.util.CpfUtil;

//Criar, alterar, consultar e excluir

@Service
public class AlunoService {
    @Autowired
    private AlunoDao alunoDao;

    public void salvar (Aluno aluno) throws  AlunoInvalidoException{
        if (!CpfUtil.isCPF(aluno.getCpf())) {
            throw new AlunoInvalidoException("Erro ao cadastrar aluno(a)" + aluno + " CPF inválido!");

        }else{
            alunoDao.save(aluno);
        }

    }





}
