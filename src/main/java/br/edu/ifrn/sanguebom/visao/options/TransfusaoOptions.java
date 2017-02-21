package br.edu.ifrn.sanguebom.visao.options;

import br.edu.ifrn.sanguebom.dominio.Transfusao;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 * Created by luisdeolpy on 21/02/2017.
 */
@ViewScoped
@Named
public class TransfusaoOptions extends Options<Transfusao, Long> {

    private static final long serialVersionUID = 1L;

    @Override
    public String label(Transfusao e) {
        return e.getReceptor().getNome();
    }

    @Override
    protected Object key(Transfusao e) {
        return e.getId();
    }

}