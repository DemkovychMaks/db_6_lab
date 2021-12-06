package iot.demkovych.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import iot.demkovych.domain.Library;
import iot.demkovych.DTO.LibraryDTO;

import iot.demkovych.mapper.AbstractMapper;
import iot.demkovych.mapper.LibraryMapper;

import iot.demkovych.service.AbstractService;
import iot.demkovych.service.LibraryService;

@RequestMapping(value = "/library")
@RestController
@AllArgsConstructor
public class LibraryController extends AbstractController<Library, LibraryDTO, Integer> {
    private final LibraryService libraryService;
    private final LibraryMapper libraryMapper;

    @Override
    public AbstractService<Library, Integer> getService() {
        return libraryService;
    }

    @Override
    public AbstractMapper<Library, LibraryDTO> getMapper() {
        return libraryMapper;
    }
}
