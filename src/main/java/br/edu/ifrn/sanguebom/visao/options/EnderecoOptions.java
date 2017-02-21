package br.edu.ifrn.sanguebom.visao.options;

import br.edu.ifrn.sanguebom.dominio.Endereco;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 * Created by luisdeolpy on 21/02/2017.
 */
@ViewScoped
@Named
public class EnderecoOptions extends Options<Endereco, Long> {

    private static final long serialVersionUID = 1L;

    @Override
    public String label(Endereco e) {
        return e.getRua();
    }

    @Override
    protected Object key(Endereco e) {
        return e.getId();
    }

}