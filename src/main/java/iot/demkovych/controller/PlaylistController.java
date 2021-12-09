package iot.demkovych.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iot.demkovych.domain.Playlist;
import iot.demkovych.DTO.PlaylistDTO;

import iot.demkovych.mapper.AbstractMapper;
import iot.demkovych.mapper.PlaylistMapper;

import iot.demkovych.service.AbstractService;
import iot.demkovych.service.PlaylistService;

@RequestMapping(value = "/playlist")
@RestController
@AllArgsConstructor
public class PlaylistController extends AbstractController<Playlist, PlaylistDTO, Integer> {
    private final PlaylistService playlistService;
    private final PlaylistMapper playlistMapper;

    @Override
    public AbstractService<Playlist, Integer> getService() {
        return playlistService;
    }

    @Override
    public AbstractMapper<Playlist, PlaylistDTO> getMapper() {
        return playlistMapper;
    }
}
