package br.edu.ifrn.sanguebom.persistencia;

import br.edu.ifrn.sanguebom.dominio.Instituicao;
import br.edu.ifrn.sanguebom.dominio.TipoSanguineo;

import java.math.BigDecimal;

/**
 * Created by luisdeolpy on 21/02/2017.
 */
public class DoacaoRepositoryImpl implements DoacaoRepositoryCustom {

    @Override
    public BigDecimal quantidade(Instituicao instituicao, TipoSanguineo tipoSanguineo){
        return new BigDecimal(0.0);
    }
}
