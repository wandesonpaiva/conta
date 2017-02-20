package br.edu.ifrn.sanguebom.persistencia;


import br.edu.ifrn.sanguebom.dominio.Transfusao;
import org.springframework.data.repository.CrudRepository;
import java.util.Date;
import java.util.List;

/**
 * Created by luisdeolpy on 20/02/2017.
 */
public interface TransfusaoRepository extends CrudRepository<Transfusao, Long> {
    List<Transfusao> findByData(Date data);
}
