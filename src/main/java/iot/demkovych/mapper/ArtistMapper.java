package iot.demkovych.mapper;

import iot.demkovych.DTO.ArtistDTO;
import iot.demkovych.domain.Artist;
import org.springframework.stereotype.Component;

@Component
public class ArtistMapper extends AbstractMapper<Artist, ArtistDTO> {
    @Override
    public ArtistDTO mapObjectToDto (Artist artist) {
        ArtistDTO.ArtistDTOBuilder artistDTOBuilder = ArtistDTO.builder();
        artistDTOBuilder.id(artist.getId());
        artistDTOBuilder.name(artist.getName());
        artistDTOBuilder.lastName(artist.getLastName());
        artistDTOBuilder.age(artist.getAge());
        artistDTOBuilder.amountOfAlbums(artist.getAmountOfAlbums());
        return artistDTOBuilder.build();
    }
}