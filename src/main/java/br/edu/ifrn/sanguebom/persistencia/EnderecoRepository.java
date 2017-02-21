package br.edu.ifrn.sanguebom.persistencia;


import br.edu.ifrn.sanguebom.dominio.Endereco;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by luisdeolpy on 20/02/2017.
 */
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
    List<Endereco> findByCidade(String cidade);
    List<Endereco> findByEstado(String estado);
}
