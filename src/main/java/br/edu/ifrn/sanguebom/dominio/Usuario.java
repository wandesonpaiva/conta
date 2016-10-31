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
 * Usuario entity.
 * @author Wandeson Paiva
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "login")
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Usuario implements Comparable<Usuario> {

	private String nome;
	private String email;
	private String senha;
	private String telefone;
	private Endereco endereco;
	private TipoSanguineo tiposanguineo;


	@Override
	public int compareTo(Usuario u) {
		int result = 0;
		if (this.nome != null && u.nome != null) {
			result = this.nome.compareTo(u.nome);
		}
		else if (u.nome == null) {
			result = 1;
		}
		else {
			result = -1;
		}
		return result;
	}


}
