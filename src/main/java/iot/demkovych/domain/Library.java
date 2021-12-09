package iot.demkovych.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@NoArgsConstructor

@Table(name = "library")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "amount_of_songs")
    private Integer amountOfSongs;

    @Column(name = "amount_of_downloaded_songs")
    private Integer amountOfDownloadedSongs;

    public Library(int id, Integer amountOfSongs, Integer amountOfDownloadedSongs) {
        this.id = id;
        this.amountOfSongs = amountOfSongs;
        this.amountOfDownloadedSongs = amountOfDownloadedSongs;
    }

    public Library(Integer amountOfSongs, Integer amountOfDownloadedSongs) {
        this.amountOfSongs = amountOfSongs;
        this.amountOfDownloadedSongs = amountOfDownloadedSongs;
    }


    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", amountOfSongs=" + amountOfSongs +
                ", amountOfDownloadedSongs=" + amountOfDownloadedSongs +
                '}';
    }
}
