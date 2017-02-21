package br.edu.ifrn.sanguebom.visao.options;

import br.edu.ifrn.sanguebom.dominio.Instituicao;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 * Created by luisdeolpy on 21/02/2017.
 */
@ViewScoped
@Named
public class InstituicaoOptions extends Options<Instituicao, Long> {

    private static final long serialVersionUID = 1L;

    @Override
    public String label(Instituicao e) {
        return e.getNomeLegal();
    }

    @Override
    protected Object key(Instituicao e) {
        return e.getId();
    }

}
