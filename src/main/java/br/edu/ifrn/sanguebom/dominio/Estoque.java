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
public class Estoque implements Comparable<Estoque> {

	private String tipo;
	private float quantidade;

}