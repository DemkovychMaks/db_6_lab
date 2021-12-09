package iot.demkovych.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import iot.demkovych.domain.Country;
import iot.demkovych.repository.CountryRepository;

@AllArgsConstructor
@Service
public class CountryService extends AbstractService<Country, Integer> {
    public CountryRepository countryRepository;

    @Override
    protected JpaRepository<Country, Integer> getRepository() {
        return countryRepository;
    }
}