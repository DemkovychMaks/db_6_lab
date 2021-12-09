package iot.demkovych.mapper;

import iot.demkovych.DTO.SongDTO;
import iot.demkovych.domain.Song;
import org.springframework.stereotype.Component;

@Component
public class SongMapper extends AbstractMapper<Song, SongDTO> {
    @Override
    public SongDTO mapObjectToDto (Song song) {
        SongDTO.SongDTOBuilder songDTOBuilder = SongDTO.builder();
        songDTOBuilder.id(song.getId());
        songDTOBuilder.name(song.getName());
        songDTOBuilder.amountOfLikes(song.getAmountOfLikes());
        songDTOBuilder.downloadedAmount(song.getDownloadedAmount());
        songDTOBuilder.streaming(song.getStreaming());
        songDTOBuilder.playlistId(song.getPlaylistId());
        songDTOBuilder.artistId(song.getArtistId());
        return songDTOBuilder.build();
    }
}