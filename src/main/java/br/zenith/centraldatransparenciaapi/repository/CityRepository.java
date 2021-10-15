package br.zenith.centraldatransparenciaapi.repository;

import br.zenith.centraldatransparenciaapi.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    public City findAllByNome(String nome);
	
}
