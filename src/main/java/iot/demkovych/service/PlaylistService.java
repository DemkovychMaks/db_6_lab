package iot.demkovych.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import iot.demkovych.domain.Playlist;
import iot.demkovych.repository.PlaylistRepository;

@AllArgsConstructor
@Service
public class PlaylistService extends AbstractService<Playlist, Integer> {
    public PlaylistRepository playlistRepository;

    @Override
    protected JpaRepository<Playlist, Integer> getRepository() {
        return playlistRepository;
    }
}
