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
	private static final String estado1 = "RN";
	private static final String estado2 = "PB";
	private static final String cidade1 = "Natal";
	private static final String cidade2 = "Parnamirim";
	private static final String bairro1 = "Potengi";
	private static final String bairro2 = "Rosa dos ventos";
	private static final String rua1 = "Florianopolis";
	private static final String rua2 = "Blumenau";
	private static final String numero1 = "2814";
	private static final String numero2 = "2842";
	private static final String cep1 = "59112250";
	private static final String cep2 = "49112000"


	@Test
	public void enderecoIgual() {
		assertThat(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build())
			.isEqualTo(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build());
	}

	@Test
	public void estadoDiferente() {
		assertThat(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build())
			.isNotEqualTo(Endereco.builder().estado(estado2).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build());
	}

	@Test
	public void cidadeDiferente() {
		assertThat(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build())
			.isNotEqualTo(Endereco.builder().estado(estado1).cidade(cidade2).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build());
	}

	@Test
	public void bairroDiferente() {
		assertThat(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build())
			.isNotEqualTo(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro2).rua(rua1).numero(numero1).cep(cep1).build());
	}

	@Test
	public void ruaDiferente() {
		assertThat(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build())
			.isNotEqualTo(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua2).numero(numero1).cep(cep1).build());
	}

	@Test
	public void numeroDiferente() {
		assertThat(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build())
			.isNotEqualTo(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero2).cep(cep1).build());
	}

	@Test
	public void cepDiferente() {
		assertThat(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep1).build())
			.isNotEqualTo(Endereco.builder().estado(estado1).cidade(cidade1).bairro(bairro1).rua(rua1).numero(numero1).cep(cep2).build());
	}

	@Test
	public void compareTo() {
		Set<Endereco> enderecos = new TreeSet<>();
		Endereco endereco1 = Endereco.builder().cidade(cidade1).estado(estado).bairro(bairro1).build();
		enderecos.add(endereco1);
		Endereco endereco2 = Endereco.builder().cidade(cidade2).estado(estado).bairro(bairro2).build();
		enderecos.add(endereco2);

		assertThat(enderecos.iterator().next()).isEqualTo(endereco1);
	}

}
