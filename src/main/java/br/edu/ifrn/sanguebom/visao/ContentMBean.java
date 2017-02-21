package br.edu.ifrn.sanguebom.visao;

import lombok.Getter;
import lombok.Setter;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 * Created by luisdeolpy on 21/02/2017.
 */
@Setter
@Getter
@Named
@ViewScoped
public class ContentMBean extends AbstractMBean {

    private static final long serialVersionUID = 1L;

    private String page = "dono";
}