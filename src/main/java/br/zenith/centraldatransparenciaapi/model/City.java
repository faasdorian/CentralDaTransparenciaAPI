package br.zenith.centraldatransparenciaapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "CITIES")
public class City {
	
	@Id
	@Column(name = "CITY_ID")
	private Long cityId;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "NOME_EXTENSO")
	private String nomeExtenso;

	public City() {
	}

	public City(Long cityId, String nome, String nomeExtenso) {
		this.cityId = cityId;
		this.nome = nome;
		this.nomeExtenso = nomeExtenso;
	}

	@Override
	public String toString() {
		return "City{" +
				"cityId=" + cityId +
				", nome='" + nome + '\'' +
				", nomeExtenso='" + nomeExtenso + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		City city = (City) o;

		return cityId != null ? cityId.equals(city.cityId) : city.cityId == null;
	}

	@Override
	public int hashCode() {
		return cityId != null ? cityId.hashCode() : 0;
	}
}
