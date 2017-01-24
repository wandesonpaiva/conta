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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
@EqualsAndHashCode(of = "email")
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Usuario implements Comparable<Usuario> {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQUENCE")
	private Long id;

	@Column(nullable = false, unique = false)
	private String nome;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false, unique = false)
	private String senha;

	@Column(nullable = false, unique = false)
	private String telefone;

	@Column(nullable = false, unique = false)
	private Endereco endereco;

	@Column(nullable = false, unique = false)
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
