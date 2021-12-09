package iot.demkovych.mapper;

import iot.demkovych.DTO.CountryDTO;
import iot.demkovych.domain.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper extends AbstractMapper<Country, CountryDTO> {
    @Override
    public CountryDTO mapObjectToDto (Country country) {
        CountryDTO.CountryDTOBuilder countryDTOBuilder = CountryDTO.builder();
        countryDTOBuilder.id(country.getId());
        countryDTOBuilder.name(country.getName());
        countryDTOBuilder.population(country.getPopulation());
        return countryDTOBuilder.build();
    }
}