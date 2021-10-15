package school.cesar.projetofinalnext.ententies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ALUNO")

public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NOME", nullable = false, unique = false)
    private String nome;

    @Column(name = "CPF", nullable = false, unique = true)
    private String cpf;
    @Column(name = "DATA_DE_NASCIMENTO", nullable = true) //voltar nullable para false
    private String dataNascimento;
    @Column(name = "CURSO", nullable = false)
    private Curso curso;
    @Column(name = "ENDEREÇO", nullable = true) //voltar nullable para false
    private String endereco;
    @Column(name = "EXPERIENCIAS", nullable = true) //voltar nullable para false
    private String experiencia;



}
