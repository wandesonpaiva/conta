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
import java.util.Date;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Doacao implements Comparable<Doacao> {

	private Usuario doador;
	private Usuario receptor;
	private Date data;
	private int quantidade;
	

	@Override
	public int compareTo(Doacao o) {
		int result = 0;
		
		return result;
	}

}