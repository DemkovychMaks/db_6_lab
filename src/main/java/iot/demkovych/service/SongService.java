package iot.demkovych.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import iot.demkovych.domain.Song;
import iot.demkovych.repository.SongRepository;

@AllArgsConstructor
@Service
public class SongService extends AbstractService<Song, Integer> {
    public SongRepository songRepository;

    @Override
    protected JpaRepository<Song, Integer> getRepository() {
        return songRepository;
    }
}
