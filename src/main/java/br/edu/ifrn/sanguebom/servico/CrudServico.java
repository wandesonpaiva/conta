package br.edu.ifrn.sanguebom.servico;
import java.io.Serializable;

import javax.inject.Inject;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
/**
 * Created by luisdeolpy on 21/02/2017.
 */
@Transactional(readOnly = true)
public class CrudServico<T extends Object, ID extends Serializable> {

    private CrudRepository<T, ID> repository;

    @Inject
    public void setRepositorio(CrudRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Transactional
    public <S extends T> Iterable<S> save(Iterable<S> objetos) {
        return this.repository.save(objetos);
    }

    @Transactional
    public <S extends T> S save(S objeto) {
        return this.repository.save(objeto);
    }

    @Transactional
    public void delete(Iterable<? extends T> objetos) {
        this.repository.delete(objetos);
    }

    @Transactional
    public void delete(ID id) {
        this.repository.delete(id);
    }

    @Transactional
    public void delete(T objeto) {
        this.repository.delete(objeto);
    }

    @Transactional
    public void deleteAll() {
        this.repository.deleteAll();
    }

    public T findOne(ID id) {
        return this.repository.findOne(id);
    }

    public Iterable<T> findAll() {
        return this.repository.findAll();
    }

    public Iterable<T> findAll(Iterable<ID> ids) {
        return this.repository.findAll(ids);
    }

    public long count() {
        return this.repository.count();
    }

    public boolean exists(ID id) {
        return this.repository.exists(id);
    }

}
