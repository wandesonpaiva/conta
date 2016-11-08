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

import java.util.Calendar;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 * Doacao entity.
 * @author Wandeson Paiva
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"doador", "data"})
@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Doacao implements Comparable<Doacao> {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQUENCE")
	private Long id;

	private Usuario doador;
	private Usuario receptor;
	private Calendar data;
	private int quantidade;

	@Override
	public int compareTo(Doacao d) {
		int result = 0;
		if (this.data != null && d.data != null) {
			result = this.data.compareTo(d.data);
		}
		else if (d.data == null) {
			result = 1;
		}
		else {
			result = -1;
		}
		return result;
	}

}
