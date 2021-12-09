package iot.demkovych.mapper;

import iot.demkovych.DTO.PlaylistDTO;
import iot.demkovych.domain.Playlist;
import org.springframework.stereotype.Component;

@Component
public class PlaylistMapper extends AbstractMapper<Playlist, PlaylistDTO> {
    @Override
    public PlaylistDTO mapObjectToDto (Playlist playlist) {
        PlaylistDTO.PlaylistDTOBuilder playlistDTOBuilder = PlaylistDTO.builder();
        playlistDTOBuilder.id(playlist.getId());
        playlistDTOBuilder.appointment(playlist.getAppointment());
        playlistDTOBuilder.about(playlist.getAbout());
        playlistDTOBuilder.libraryId(playlist.getLibraryId());
        return playlistDTOBuilder.build();
    }
}