package br.zenith.centraldatransparenciaapi.service;

import br.zenith.centraldatransparenciaapi.model.City;
import br.zenith.centraldatransparenciaapi.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public City getCityByNome(String nome) {
        City city = cityRepository.findAllByNome(nome);
        return city;
    }

    public List<City> getAll() {
        List<City> cities = (List<City>) cityRepository.findAll();
        return cities;
    }
}
