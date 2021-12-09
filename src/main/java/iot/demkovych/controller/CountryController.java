package iot.demkovych.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iot.demkovych.domain.Country;
import iot.demkovych.DTO.CountryDTO;

import iot.demkovych.mapper.AbstractMapper;
import iot.demkovych.mapper.CountryMapper;

import iot.demkovych.service.AbstractService;
import iot.demkovych.service.CountryService;

@RequestMapping(value = "/country")
@RestController
@AllArgsConstructor
public class CountryController extends AbstractController<Country, CountryDTO, Integer> {
    private final CountryService countryService;
    private final CountryMapper countryMapper;

    @Override
    public AbstractService<Country, Integer> getService() {
        return countryService;
    }

    @Override
    public AbstractMapper<Country, CountryDTO> getMapper() {
        return countryMapper;
    }
}
