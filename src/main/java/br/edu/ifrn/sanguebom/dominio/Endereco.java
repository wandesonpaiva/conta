/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.edu.ifrn.sanguebom.dominio;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Endereco entity.
 * @author Wandeson Paiva
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Endereco implements Comparable<Endereco> {

	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;


	@Override
	public int compareTo(Endereco e) {
		int result = 0;
		if (this.cidade != null && e.cidade != null) {
			result = this.cidade.compareTo(e.cidade);
		}
		else if (e.cidade == null) {
			result = 1;
		}
		else {
			result = -1;
		}
		return result;
	}

}
