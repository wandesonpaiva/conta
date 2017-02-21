package br.edu.ifrn.sanguebom.visao.options;

import br.edu.ifrn.sanguebom.dominio.Usuario;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 * Created by luisdeolpy on 21/02/2017.
 */
@ViewScoped
@Named
public class UsuarioOptions extends Options<Usuario, Long> {

    private static final long serialVersionUID = 1L;

    @Override
    public String label(Usuario e) {
        return e.getNome();
    }

    @Override
    protected Object key(Usuario e) {
        return e.getId();
    }

}
