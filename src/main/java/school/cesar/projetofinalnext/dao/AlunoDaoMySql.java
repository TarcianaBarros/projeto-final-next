package school.cesar.projetofinalnext.dao;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import school.cesar.projetofinalnext.ententies.Aluno;

import java.util.List;
import java.util.Optional;

public class AlunoDaoMySql implements AlunoDao {




    @Override

    public void salvar (Aluno aluno){

    }



    //JPA

    @Override
    public Aluno findByCpf(String cpf){
        return null;
    }


    @Override
    public List<Aluno> findAll() {
        return null;
    }

    @Override
    public List<Aluno> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Aluno> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Aluno> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Aluno aluno) {

    }

    @Override
    public void deleteAll(Iterable<? extends Aluno> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Aluno> S save(S s) {
        return null;
    }

    @Override
    public <S extends Aluno> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Aluno> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Aluno> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Aluno> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Aluno getOne(Long aLong) {
        return null;
    }

    @Override
    public <S extends Aluno> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Aluno> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Aluno> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Aluno> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Aluno> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Aluno> boolean exists(Example<S> example) {
        return false;
    }
}
