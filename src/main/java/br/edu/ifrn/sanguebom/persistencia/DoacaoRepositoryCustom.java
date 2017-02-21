package br.edu.ifrn.sanguebom.persistencia;

import br.edu.ifrn.sanguebom.dominio.Instituicao;
import br.edu.ifrn.sanguebom.dominio.TipoSanguineo;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

/**
 * Created by luisdeolpy on 21/02/2017.
 */
public interface DoacaoRepositoryCustom {
    BigDecimal quantidade(Instituicao instituicao, TipoSanguineo tipoSanguineo);
}
