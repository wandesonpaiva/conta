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

public class InstituicaoTests {
	private static final String NOME_LEGAL1 = "Casa Seilaoque do Sangue";
	private static final String NOME_LEGAL2 = "Casa FulanoDeTal do Sangue";
	
	@Test
	public void InstituicaoIgual() {
		assertThat(Instituicao.builder().NomeLegal(NOME_LEGAL1).build()).endereco(Endereco.builder().cidade("Natal").estado("RN").bairro("Potengi").build()).build())
			.isEqualTo(Instituicao.builder().NomeLegal(NOME_LEGAL1).build()).endereco(Endereco.builder().cidade("Natal").estado("RN").bairro("Potengi").build()).build());	
	}

	@Test
	public void InstituicaoDiferente() {
		assertThat(Instituicao.builder().NomeLegal(NOME_LEGAL1).endereco(Endereco.builder().cidade("Natal").estado("RN").bairro("Potengi").build()).build())
			.isNotEqualTo(Instituicao.builder().NomeLegal(NOME_LEGAL2).endereco(Endereco.builder().cidade("Natal").estado("RN").bairro("Potengi").build()).build())
	}
	@Test
	public void compareTo() {
		Set<Instituicao> instituicoes = new TreeSet<>();

		Instituicao instituicao1 = Instituicao.builder().NomeLegal(NOME_LEGAL1).endereco(Endereco.builder().cidade("Natal").estado("RN").bairro("Potengi").build()).build();
		instituicoes.add(instituicao1);
		Instituicao instituicao2 = Instituicao.builder().NomeLegal(NOME_LEGAL2).endereco(Endereco.builder().cidade("Parnamirim").estado("RN").bairro("Rosa dos ventos").build()).build();
		instituicoes.add(instituicao2);

		assertThat(instituicoes.iterator().next()).isEqualTo(instituicao1);
	}
}
