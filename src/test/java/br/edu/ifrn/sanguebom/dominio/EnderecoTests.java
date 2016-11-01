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

//import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EnderecoTests {
	private static final String estado = "RN";
	private static final String cidade1 = "Natal";
	private static final String cidade2 = "Parnamirim";
	private static final String bairro1 = "Potengi";
	private static final String bairro2 = "Rosa dos ventos";

	@Test
	public void EnderecoIgual() {
		assertThat(Endereco.builder().cidade(cidade1).estado(estado).bairro(bairro1).build())
			.isEqualTo(Endereco.builder().cidade(cidade1).estado(estado).bairro(bairro1).build());
	}

	@Test
	public void EnderecoDiferente() {
		assertThat(Endereco.builder().cidade(cidade1).estado(estado).bairro(bairro1).build())
			.isNotEqualTo(Endereco.builder().cidade(cidade2).estado(estado).bairro(bairro2).build());
	}
	@Test
	public void compareTo() {
		Set<Endereco> enderecos = new TreeSet<>();
		Endereco endereco1 = Endereco.builder().cidade(cidade1).estado(estado).bairro(bairro1).builder();
		enderecos.add(endereco1);
		Endereco endereco2 = Endereco.builder().cidade(cidade2).estado(estado).bairro(bairro2).builder();
		enderecos.add(endereco2);

		assertThat(enderecos.iterator().next()).isEqualTo(endereco1);
	}

}
