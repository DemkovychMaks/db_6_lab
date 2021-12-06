package iot.demkovych.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import iot.demkovych.domain.Library;
import iot.demkovych.repository.LibraryRepository;

@AllArgsConstructor
@Service
public class LibraryService extends AbstractService<Library, Integer> {
    public LibraryRepository libraryRepository;

    @Override
    protected JpaRepository<Library, Integer> getRepository() {
        return libraryRepository;
    }
}