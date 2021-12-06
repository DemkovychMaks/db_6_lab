package iot.demkovych.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import iot.demkovych.domain.Artist;
import iot.demkovych.repository.ArtistRepository;

@AllArgsConstructor
@Service
public class ArtistService extends AbstractService<Artist, Integer> {
    public ArtistRepository artistRepository;

    @Override
    protected JpaRepository<Artist, Integer> getRepository() {
        return artistRepository;
    }
}