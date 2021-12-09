package iot.demkovych.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iot.demkovych.domain.Artist;
import iot.demkovych.DTO.ArtistDTO;

import iot.demkovych.mapper.AbstractMapper;
import iot.demkovych.mapper.ArtistMapper;

import iot.demkovych.service.AbstractService;
import iot.demkovych.service.ArtistService;

@RequestMapping(value = "/artist")
@RestController
@AllArgsConstructor
public class ArtistController extends AbstractController<Artist, ArtistDTO, Integer> {
    private final ArtistService artistService;
    private final ArtistMapper artistMapper;

    @Override
    public AbstractService<Artist, Integer> getService() {
        return artistService;
    }

    @Override
    public AbstractMapper<Artist, ArtistDTO> getMapper() {
        return artistMapper;
    }
}
