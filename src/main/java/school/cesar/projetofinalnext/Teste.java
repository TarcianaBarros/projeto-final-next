package school.cesar.projetofinalnext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import school.cesar.projetofinalnext.dao.AlunoDao;
import school.cesar.projetofinalnext.ententies.Aluno;
import school.cesar.projetofinalnext.services.AlunoService;

@SpringBootApplication
public class Teste implements CommandLineRunner {
    @Autowired
    private AlunoDao clienteDAO;

    public static void main(String[] args) {
        SpringApplication.run(Teste.class, args); //Rodar o Spring, esse classe

    }
    @Override
    public void run(String... args) throws RuntimeException {
        System.out.println("Comecei a executar daqui");
        Aluno aluno1 = new Aluno();
        aluno1.setNome ("Manoel Pedroza");
        aluno1.setCpf("907.718.080-03");

        AlunoService alunoService = new AlunoService();

        alunoService.salvar(aluno1);


    }

}
