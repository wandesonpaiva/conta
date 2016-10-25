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


	@Override
	public int compareTo(Estoque o) {
		int result = 0;
		if (this.tipo != null && o.tipo != null){
			result = this.tipo.compareTo(o.tipo);
		} else if (this.tipo == null && o.tipo == null) {
			result = 0;
		}
		else if (this.tipo == null) {
			result = -1;
		}
		else {
			result = +1;
		}

		return result;
	}

}