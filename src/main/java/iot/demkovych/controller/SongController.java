package iot.demkovych.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iot.demkovych.domain.Song;
import iot.demkovych.DTO.SongDTO;

import iot.demkovych.mapper.AbstractMapper;
import iot.demkovych.mapper.SongMapper;

import iot.demkovych.service.AbstractService;
import iot.demkovych.service.SongService;


@RequestMapping(value = "/song")
@RestController
@AllArgsConstructor
public class SongController extends AbstractController<Song, SongDTO, Integer> {
    private final SongService songService;
    private final SongMapper songMapper;

    @Override
    public AbstractService<Song, Integer> getService() {
        return songService;
    }

    @Override
    public AbstractMapper<Song, SongDTO> getMapper() {
        return songMapper;
    }
}
