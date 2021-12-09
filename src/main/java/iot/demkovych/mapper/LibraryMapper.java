package iot.demkovych.mapper;

import iot.demkovych.DTO.LibraryDTO;
import iot.demkovych.domain.Library;
import org.springframework.stereotype.Component;

@Component
public class LibraryMapper extends AbstractMapper<Library, LibraryDTO> {
    @Override
    public LibraryDTO mapObjectToDto (Library library) {
        LibraryDTO.LibraryDTOBuilder libraryDTOBuilder = LibraryDTO.builder();
        libraryDTOBuilder.id(library.getId());
        libraryDTOBuilder.amountOfSongs(library.getAmountOfSongs());
        libraryDTOBuilder.amountOfDownloadedSongs(library.getAmountOfDownloadedSongs());
        return libraryDTOBuilder.build();
    }
}