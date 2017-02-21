package br.edu.ifrn.sanguebom.visao.options;

import br.edu.ifrn.sanguebom.dominio.Doacao;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 * Created by luisdeolpy on 21/02/2017.
 */
@ViewScoped
@Named
public class DoacaoOptions extends Options<Doacao, Long> {

    private static final long serialVersionUID = 1L;

    @Override
    public String label(Doacao e) {
        return e.getReceptor().getNome();
    }

    @Override
    protected Object key(Doacao e) {
        return e.getId();
    }

}
