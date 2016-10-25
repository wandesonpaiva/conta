package br.edu.ifrn.sanguebom.dominio;

import java.io.Serializable;
import java.util.Set;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Singular;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Endereco implements Comparable<Endereco> {


	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	private int cep;


}