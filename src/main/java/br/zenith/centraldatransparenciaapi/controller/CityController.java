package br.zenith.centraldatransparenciaapi.controller;

import br.zenith.centraldatransparenciaapi.model.City;
import br.zenith.centraldatransparenciaapi.repository.CityRepository;
import br.zenith.centraldatransparenciaapi.service.CityService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    CityService  cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/cities")
    public ResponseEntity<List<City>> getCities() {
        List<City> cities = cityService.getAll();
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<City> getCityByNome(@PathVariable String nome) {
        City city = cityService.getCityByNome(nome);

        if (city == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(city, HttpStatus.OK);
    }

}
